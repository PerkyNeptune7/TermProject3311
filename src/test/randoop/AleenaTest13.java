package src.test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AleenaTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6501");
        src.java.Student student3 = new src.java.Student("EQ-3678", "Equipment ID: EQ-4383, Name: EQ-684, Description: EQ-1102, Location: EQ-628, Status: AVAILABLE", "EQ-1891");
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6502");
        src.java.HeadLabCoordinator headLabCoordinator0 = src.java.HeadLabCoordinator.getInstance();
        java.lang.String str1 = headLabCoordinator0.password;
        headLabCoordinator0.needsapproval = false;
        src.java.LabManager labManager6 = headLabCoordinator0.autoGenerateLabManager("COORD-001", "hi!");
        src.java.LabManager labManager9 = headLabCoordinator0.autoGenerateLabManager("Equipment ID: EQ-323, Name: Equipment ID: EQ-26, Name: , Description: , Location: , Status: null, Description: Head Lab Coordinator, Location: EQ-63, Status: AVAILABLE", "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str10 = labManager9.password;
        double double11 = labManager9.getHourlyRate();
        labManager9.username = "Equipment ID: EQ-177, Name: , Description: , Location: , Status: null";
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(labManager6);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE" + "'", str10, "Equipment ID: EQ-314, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6503");
        src.java.Arduino arduino3 = new src.java.Arduino("EQ-615", "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-725, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE");
        java.lang.String str4 = arduino3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-315, Name: , Description: , Location: , Status: null");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6504");
        src.java.Faculty faculty3 = new src.java.Faculty("EQ-36", "EQ-36", "Equipment ID: EQ-83, Name: , Description: , Location: , Status: null");
        faculty3.username = "EQ-104";
        faculty3.username = "EQ-461";
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.needsapproval;
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6505");
        src.java.EquipmentFactory equipmentFactory0 = new src.java.EquipmentFactory();
        // The following exception was thrown during execution in test generation
        try {
            src.java.Equipment equipment5 = equipmentFactory0.createEquipment("Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE", "Equipment ID: EQ-4755, Name: Guest, Description: EQ-36, Location: Equipment ID: EQ-133, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Status: AVAILABLE", "EQ-5256", "EQ-1238");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown equipment type: Equipment ID: EQ-2343, Name: EQ-63, Description: Equipment ID: EQ-249, Name: Equipment ID: EQ-30, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-16, Name: , Description: , Location: , Status: null, Location: EQ-39, Status: AVAILABLE, Location: , Status: AVAILABLE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6506");
        src.java.Guest guest3 = new src.java.Guest("EQ-851", "Equipment ID: EQ-720, Name: hi!, Description: , Location: hi!, Status: null", "EQ-690");
        java.lang.String str4 = guest3.getRegistrationId();
        java.lang.String str5 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-690" + "'", str4, "EQ-690");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Guest" + "'", str5, "Guest");
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6507");
        src.java.Researcher researcher3 = new src.java.Researcher("Equipment ID: EQ-41, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null", "Faculty");
        java.lang.String str4 = researcher3.username;
        java.lang.String str5 = researcher3.username;
        boolean boolean6 = researcher3.isapproved;
        java.lang.String str7 = researcher3.password;
        java.lang.String str8 = researcher3.getAccountType();
        researcher3.needsapproval = true;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str4, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null" + "'", str5, "Equipment ID: EQ-41, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null" + "'", str7, "Equipment ID: EQ-26, Name: , Description: , Location: , Status: null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Researcher" + "'", str8, "Researcher");
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6508");
        src.java.Microscope microscope3 = new src.java.Microscope("EQ-764", "EQ-2980", "Equipment ID: EQ-1768, Name: Equipment ID: EQ-124, Name: , Description: , Location: , Status: null, Description: COORD-001, Location: EQ-39, Status: AVAILABLE");
        java.lang.String str4 = microscope3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EQ-764" + "'", str4, "EQ-764");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6509");
        src.java.Faculty faculty3 = new src.java.Faculty("MANAGER-66181089", "EQ-446", "EQ-3078");
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6510");
        src.java.Student student3 = new src.java.Student("Equipment ID: EQ-1180, Name: Guest, Description: Equipment ID: EQ-41, Name: , Description: , Location: , Status: null, Location: COORD-001, Status: AVAILABLE", "EQ-221", "EQ-2375");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getRegistrationId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EQ-2375" + "'", str5, "EQ-2375");
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "src.test.randoop.AleenaTest13.test6511");
        src.java.Guest guest3 = new src.java.Guest("Equipment ID: EQ-3866, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE", "Equipment ID: EQ-976, Name: , Description: , Location: , Status: null", "Equipment ID: EQ-2202, Name: Equipment ID: EQ-549, Name: Head Lab Coordinator, Description: , Location: hi!, Status: AVAILABLE, Description: Equipment ID: EQ-287, Name: , Description: , Location: , Status: null, Location: EQ-508, Status: AVAILABLE");
        java.lang.String str4 = guest3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Guest" + "'", str4, "Guest");
    }
}
