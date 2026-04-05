package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.Class<?> wildcardClass1 = institutionalPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass2 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass3 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass3 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass3 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        java.lang.Class<?> wildcardClass1 = researcherPricing0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass5 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass3 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) ' ');
        java.lang.Class<?> wildcardClass3 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str2, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str10 = grantPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str6 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str6 = debitCardPayment0.processPayment(100.0d);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.Class<?> wildcardClass1 = debitCardPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 'a');
        java.lang.String str8 = grantPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str6, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = grantPayment0.processPayment(20.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str8, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str8 = debitCardPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100L);
        java.lang.String str8 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        double double15 = researcherPricing0.calculateRate();
        double double16 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass17 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str10 = debitCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 0L);
        java.lang.String str8 = grantPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass15 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment(0.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 1);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str14 = institutionalPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $32.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass5 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str6, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass17 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str10, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass13 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass14 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str4, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 'a');
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str8, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 1);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str10 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) '4');
        java.lang.String str10 = grantPayment0.processPayment(30.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str10, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str6 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str14 = grantPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str14, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass4 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100L);
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str24 = creditCardPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str22, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str14 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str14, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str18 = creditCardPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = grantPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str8, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(20.0d);
        java.lang.Class<?> wildcardClass5 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str4, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str10, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = grantPayment0.processPayment((double) 1);
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str10 = debitCardPayment0.processPayment((-1.0d));
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100L);
        java.lang.String str8 = grantPayment0.processPayment(10.0d);
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.Class<?> wildcardClass3 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment(100.0d);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str10 = debitCardPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str6, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str8, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str10, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        java.lang.Class<?> wildcardClass1 = facultyPricing0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass3 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str16 = institutionalPayment0.processPayment((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass21 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str12, "Processing direct debit payment of $52.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str10 = grantPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass13 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 0);
        java.lang.String str8 = grantPayment0.processPayment(100.0d);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str8 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(20.0d);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str10, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str6, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str12 = debitCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str8 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str10, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        double double9 = facultyPricing0.calculateRate();
        double double10 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(15.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $15.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(30.0d);
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str2, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str8 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str10, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 100L);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        double double9 = guestPricing0.calculateRate();
        double double10 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        double double9 = guestPricing0.calculateRate();
        double double10 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str12 = debitCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str10, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str6, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 0);
        java.lang.String str12 = grantPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str14 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1L);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str14 = grantPayment0.processPayment(0.0d);
        java.lang.String str16 = grantPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass23 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str22, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $97.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 'a');
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str6, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str10 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = grantPayment0.processPayment((double) 100);
        java.lang.String str14 = grantPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str14, "Deducting $10.00 from registered Research Grant funds.");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        double double9 = guestPricing0.calculateRate();
        double double10 = guestPricing0.calculateRate();
        double double11 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment(0.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) 0);
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str6, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 'a');
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str12, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass5 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str14 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str12, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str8, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) '#');
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str8, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = debitCardPayment0.processPayment((double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str14, "Processing direct debit payment of $52.00. No extra fees.");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass13 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(10.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100L);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = grantPayment0.processPayment((double) 1);
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.Class<?> wildcardClass3 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(1.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass15 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass5 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10);
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass17 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass15 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.Class<?> wildcardClass5 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str10 = debitCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str10, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        double double9 = facultyPricing0.calculateRate();
        double double10 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str4 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str12 = grantPayment0.processPayment((double) 'a');
        java.lang.String str14 = grantPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str12, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass5 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = debitCardPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        double double9 = guestPricing0.calculateRate();
        double double10 = guestPricing0.calculateRate();
        double double11 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str16 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.Class<?> wildcardClass17 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str14, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str16, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = debitCardPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = creditCardPayment0.processPayment(15.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str12, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str16, "Processing credit card payment of $15.30 plus 2% processing fee.");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass15 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str14 = debitCardPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 0);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) '4');
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str10, "Processing direct debit payment of $52.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str14 = debitCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str12, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str8, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str18 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str22 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str12 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str14 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str6, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str8, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) 100L);
        java.lang.String str10 = grantPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((-1.0d));
        java.lang.String str8 = institutionalPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        double double9 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) 1);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str6 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str10 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.Class<?> wildcardClass5 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str8 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass17 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = grantPayment0.processPayment(20.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str8, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str10 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        double double9 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.Class<?> wildcardClass17 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str14 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str10 = debitCardPayment0.processPayment(30.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str10, "Processing direct debit payment of $30.00. No extra fees.");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(10.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str4 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str6 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str8 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 'a');
        java.lang.String str8 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = grantPayment0.processPayment((double) 100L);
        java.lang.String str14 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str16 = grantPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str6, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str8, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str12, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = debitCardPayment0.processPayment((-1.0d));
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str12 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str6, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str12, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) '4');
        java.lang.String str10 = grantPayment0.processPayment(30.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = grantPayment0.processPayment((double) '#');
        java.lang.String str18 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str20 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str22 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str24 = grantPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str10, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str16, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str18, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str20, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str22, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str24, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        double double9 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = grantPayment0.processPayment(20.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) '#');
        java.lang.String str14 = grantPayment0.processPayment((double) '#');
        java.lang.String str16 = grantPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str8, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str12, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str14, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str16, "Deducting $32.00 from registered Research Grant funds.");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        double double9 = guestPricing0.calculateRate();
        double double10 = guestPricing0.calculateRate();
        double double11 = guestPricing0.calculateRate();
        double double12 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass13 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str10 = grantPayment0.processPayment(0.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = grantPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass17 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str16, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10);
        java.lang.String str10 = institutionalPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((-1.0d));
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass7 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str18 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str8, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = grantPayment0.processPayment(1.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 'a');
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str12, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        double double9 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass10 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        double double11 = studentPricing0.calculateRate();
        double double12 = studentPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment(100.0d);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = grantPayment0.processPayment((double) '#');
        java.lang.String str10 = grantPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str8, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        double double15 = researcherPricing0.calculateRate();
        double double16 = researcherPricing0.calculateRate();
        double double17 = researcherPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        double double5 = studentPricing0.calculateRate();
        double double6 = studentPricing0.calculateRate();
        double double7 = studentPricing0.calculateRate();
        double double8 = studentPricing0.calculateRate();
        double double9 = studentPricing0.calculateRate();
        double double10 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass11 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str6, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = debitCardPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = creditCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str10, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass17 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str12 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str10, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str4 = grantPayment0.processPayment((double) ' ');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str4, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str8 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str10 = debitCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(10.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) ' ');
        java.lang.String str8 = grantPayment0.processPayment((double) (short) 0);
        java.lang.String str10 = grantPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str6, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment((double) 100L);
        java.lang.String str4 = grantPayment0.processPayment((-1.0d));
        java.lang.String str6 = grantPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str2, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str4, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str6, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment(30.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str12, "Processing direct debit payment of $30.00. No extra fees.");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass3 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str6 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = creditCardPayment0.processPayment(100.0d);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = debitCardPayment0.processPayment(15.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str12, "Processing direct debit payment of $15.00. No extra fees.");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0);
        java.lang.String str6 = institutionalPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass8 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) '#');
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str8, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str18 = creditCardPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str10, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment(0.0d);
        java.lang.String str12 = grantPayment0.processPayment(0.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str14, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str14 = debitCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str12, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        double double9 = facultyPricing0.calculateRate();
        double double10 = facultyPricing0.calculateRate();
        double double11 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass6 = facultyPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        double double15 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass16 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str6 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = debitCardPayment0.processPayment((double) 1L);
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str14, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str14 = creditCardPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str14, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str4 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str8 = creditCardPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass9 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str6, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100L);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = grantPayment0.processPayment(20.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) 0.0f);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str8, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        double double13 = researcherPricing0.calculateRate();
        double double14 = researcherPricing0.calculateRate();
        double double15 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass16 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass12 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str16 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str20 = creditCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str16, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass13 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        app.ResearcherPricing researcherPricing0 = new app.ResearcherPricing();
        double double1 = researcherPricing0.calculateRate();
        double double2 = researcherPricing0.calculateRate();
        double double3 = researcherPricing0.calculateRate();
        double double4 = researcherPricing0.calculateRate();
        double double5 = researcherPricing0.calculateRate();
        double double6 = researcherPricing0.calculateRate();
        double double7 = researcherPricing0.calculateRate();
        double double8 = researcherPricing0.calculateRate();
        double double9 = researcherPricing0.calculateRate();
        double double10 = researcherPricing0.calculateRate();
        double double11 = researcherPricing0.calculateRate();
        double double12 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass13 = researcherPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass15 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass9 = guestPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str6 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = debitCardPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) '4');
        java.lang.String str10 = grantPayment0.processPayment(30.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = grantPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass17 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str10, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.Class<?> wildcardClass11 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

