package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = debitCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str8, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str20 = institutionalPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) 1L);
        java.lang.String str14 = grantPayment0.processPayment((double) 1);
        java.lang.String str16 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str18 = grantPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str16, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str18, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str18 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
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
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 0L);
        java.lang.String str8 = grantPayment0.processPayment((double) 0);
        java.lang.String str10 = grantPayment0.processPayment(0.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = grantPayment0.processPayment(0.0d);
        java.lang.String str18 = grantPayment0.processPayment((double) 0);
        java.lang.String str20 = grantPayment0.processPayment(20.0d);
        java.lang.String str22 = grantPayment0.processPayment((double) ' ');
        java.lang.String str24 = grantPayment0.processPayment(0.0d);
        java.lang.String str26 = grantPayment0.processPayment((double) 100);
        java.lang.String str28 = grantPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str18, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str20, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str22, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str24, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str26, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str28, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) ' ');
        java.lang.String str16 = grantPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str14, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 'a');
        java.lang.String str8 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = grantPayment0.processPayment((double) 100L);
        java.lang.String str14 = grantPayment0.processPayment(0.0d);
        java.lang.String str16 = grantPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str6, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str6 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.String str20 = creditCardPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass21 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(1.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str18 = institutionalPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str22 = creditCardPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str22, "Processing credit card payment of $20.40 plus 2% processing fee.");
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
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
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) 0L);
        java.lang.String str14 = grantPayment0.processPayment((double) 10);
        java.lang.String str16 = grantPayment0.processPayment(0.0d);
        java.lang.String str18 = grantPayment0.processPayment((double) 'a');
        java.lang.String str20 = grantPayment0.processPayment(15.0d);
        java.lang.String str22 = grantPayment0.processPayment((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str14, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str18, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str20, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str22, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str18 = debitCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str16, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str18, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str22 = creditCardPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str12, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str22, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str16 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str18 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str20 = debitCardPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str20, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
        double double17 = guestPricing0.calculateRate();
        double double18 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str14 = debitCardPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str14, "Processing direct debit payment of $20.00. No extra fees.");
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
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
        double double12 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str18 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str18 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str20 = debitCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str16, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str18, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str20, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str16 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str20 = debitCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str16, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str18, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str20, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100L);
        java.lang.String str8 = grantPayment0.processPayment(10.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment(20.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 0);
        java.lang.String str16 = grantPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str12, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) 1L);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = grantPayment0.processPayment((double) '#');
        java.lang.String str14 = grantPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str12, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) '4');
        java.lang.String str10 = grantPayment0.processPayment(30.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.Class<?> wildcardClass15 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str10, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = grantPayment0.processPayment(0.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
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
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
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
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str6, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str18, "Processing credit card payment of $35.70 plus 2% processing fee.");
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
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
        double double18 = researcherPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 0);
        java.lang.String str16 = institutionalPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
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
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
        double double19 = facultyPricing0.calculateRate();
        double double20 = facultyPricing0.calculateRate();
        double double21 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str10, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
        double double19 = facultyPricing0.calculateRate();
        double double20 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str10 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str16 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str20 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str22 = debitCardPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str20, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str22, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str12 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str22 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str24 = creditCardPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str24, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
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
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.Class<?> wildcardClass11 = creditCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str18 = institutionalPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str16 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str18 = institutionalPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass19 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str12 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
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
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str10 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str18 = creditCardPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str18, "Processing credit card payment of $20.40 plus 2% processing fee.");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
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
        double double13 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str16 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str10 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str10, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.String str8 = grantPayment0.processPayment(100.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) 1);
        java.lang.String str12 = grantPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str10 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str16 = creditCardPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str8, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str16, "Processing credit card payment of $20.40 plus 2% processing fee.");
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str16 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str22 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str24 = creditCardPayment0.processPayment((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str22, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
        double double17 = guestPricing0.calculateRate();
        double double18 = guestPricing0.calculateRate();
        java.lang.Class<?> wildcardClass19 = guestPricing0.getClass();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment(0.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 1);
        java.lang.String str14 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str16 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str18 = grantPayment0.processPayment((double) 100);
        java.lang.String str20 = grantPayment0.processPayment((double) 10L);
        java.lang.String str22 = grantPayment0.processPayment((double) 100L);
        java.lang.String str24 = grantPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str18, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str20, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str22, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str24, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str18 = grantPayment0.processPayment(1.0d);
        java.lang.String str20 = grantPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str18, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str20, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '#');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = grantPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = grantPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str4, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str10, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str18 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str16 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str18 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str22 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str24 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str24, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str12 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str14 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str16 = creditCardPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str12, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str14, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str16, "Processing credit card payment of $32.64 plus 2% processing fee.");
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str22 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str24 = creditCardPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str8, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str12, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str12 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str16 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str18 = debitCardPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str10, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str14 = creditCardPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str12, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
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
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str8, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = grantPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass17 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment(1.0d);
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str16, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str18 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
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
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
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
        double double18 = researcherPricing0.calculateRate();
        double double19 = researcherPricing0.calculateRate();
        double double20 = researcherPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str18 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str22 = creditCardPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str16 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str18 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str20 = debitCardPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str14, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str18, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str20, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str18 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str22 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str24 = institutionalPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str24, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) 100L);
        java.lang.String str12 = grantPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
        double double19 = facultyPricing0.calculateRate();
        double double20 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = grantPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
        double double19 = facultyPricing0.calculateRate();
        double double20 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str6 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str10 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.Class<?> wildcardClass15 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str6 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str4, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 1L);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str16, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str24 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str26 = creditCardPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str22, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str26, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) 10);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str14 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str16 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str18 = grantPayment0.processPayment((double) 0L);
        java.lang.String str20 = grantPayment0.processPayment((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str14, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str16, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str18, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str20, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str18 = debitCardPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str8 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str12 = debitCardPayment0.processPayment(10.0d);
        java.lang.String str14 = debitCardPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str8, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 0);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str12 = institutionalPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = debitCardPayment0.processPayment(15.0d);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str12, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str8 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str10, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
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
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        app.StudentPricing studentPricing0 = new app.StudentPricing();
        double double1 = studentPricing0.calculateRate();
        double double2 = studentPricing0.calculateRate();
        double double3 = studentPricing0.calculateRate();
        double double4 = studentPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str14 = debitCardPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str8, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str12, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str12 = grantPayment0.processPayment(0.0d);
        java.lang.String str14 = grantPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass15 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str14, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) '4');
        java.lang.String str14 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str18 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str20 = debitCardPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str12, "Processing direct debit payment of $52.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str18, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str20, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str18 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str20 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str22 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.Class<?> wildcardClass23 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        app.FacultyPricing facultyPricing0 = new app.FacultyPricing();
        double double1 = facultyPricing0.calculateRate();
        double double2 = facultyPricing0.calculateRate();
        double double3 = facultyPricing0.calculateRate();
        double double4 = facultyPricing0.calculateRate();
        double double5 = facultyPricing0.calculateRate();
        double double6 = facultyPricing0.calculateRate();
        double double7 = facultyPricing0.calculateRate();
        double double8 = facultyPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) '#');
        java.lang.Class<?> wildcardClass13 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment(10.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str12 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = grantPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str6, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str14, "Deducting $32.00 from registered Research Grant funds.");
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str16 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str20 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str20 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str22 = debitCardPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str12, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str14, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str18, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str20, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str22, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = creditCardPayment0.processPayment(30.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str10, "Processing credit card payment of $30.60 plus 2% processing fee.");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str16 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str18 = institutionalPayment0.processPayment((-1.0d));
        java.lang.String str20 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str22 = institutionalPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
        double double17 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 'a');
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str6, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str8, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
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
        double double13 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str14, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str18 = institutionalPayment0.processPayment((-1.0d));
        java.lang.String str20 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str16 = debitCardPayment0.processPayment(30.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str16, "Processing direct debit payment of $30.00. No extra fees.");
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str22 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str24 = creditCardPayment0.processPayment((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str10, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
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
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = grantPayment0.processPayment((double) 1);
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str14 = grantPayment0.processPayment(100.0d);
        java.lang.String str16 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str18 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str20 = grantPayment0.processPayment((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str18, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str20, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str6 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str8 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str10 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str6, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str8, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
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
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((-1.0d));
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
        double double19 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str10, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str14, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str16, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 1L);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str18 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str20 = debitCardPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str16, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str18, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str20, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10);
        java.lang.String str14 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str18 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str20 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str16 = grantPayment0.processPayment((double) 1);
        java.lang.String str18 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str20 = grantPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str14, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str16, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str18, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str20, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str12 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str18 = institutionalPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str14 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str16 = debitCardPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str10, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str12, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str16, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
        double double19 = studentPricing0.calculateRate();
        double double20 = studentPricing0.calculateRate();
        double double21 = studentPricing0.calculateRate();
        double double22 = studentPricing0.calculateRate();
        double double23 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str18 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str22 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str24 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str26 = institutionalPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str24, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str26, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str14 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str16 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str18 = institutionalPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
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
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str8, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str18, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
        double double19 = facultyPricing0.calculateRate();
        double double20 = facultyPricing0.calculateRate();
        double double21 = facultyPricing0.calculateRate();
        double double22 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
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
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str4 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str18 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str20 = institutionalPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str6 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str10 = creditCardPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str10, "Processing credit card payment of $32.64 plus 2% processing fee.");
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str18 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str20 = institutionalPayment0.processPayment((double) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $35.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str14 = institutionalPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) 1L);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = grantPayment0.processPayment(20.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) '#');
        java.lang.String str16 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str18 = grantPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str12, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str14, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str18, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
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
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
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
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str4, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str8, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str18 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str20 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str18, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str16 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str18 = institutionalPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
        double double19 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment((double) 'a');
        java.lang.String str14 = grantPayment0.processPayment((double) 10);
        java.lang.String str16 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str18 = grantPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str12, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str14, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str18, "Deducting $10.00 from registered Research Grant funds.");
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) '4');
        java.lang.String str14 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str16 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str18 = grantPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str12, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str18, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str20 = debitCardPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str16, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str18, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str20, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str6 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str8 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str6, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str8, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 0L);
        java.lang.Class<?> wildcardClass15 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str20 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str18, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str22, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
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
        double double13 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str8 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str10, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str14 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) ' ');
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment((double) 100L);
        java.lang.String str12 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str14 = grantPayment0.processPayment((double) 1);
        java.lang.String str16 = grantPayment0.processPayment((double) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str6, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str22 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str24 = creditCardPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str22, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str24, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
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
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
        double double19 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = debitCardPayment0.processPayment(10.0d);
        java.lang.String str18 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str20 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str22 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str24 = debitCardPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str10, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str18, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str20, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str22, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str24, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $32.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str14 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str10, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str12, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str22 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str24 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str26 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str28 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str20, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str22, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str24, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str26, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str28, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str14 = grantPayment0.processPayment((double) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str10, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str14, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str8 = grantPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str16 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str18 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str20 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str22 = grantPayment0.processPayment((double) (byte) 100);
        java.lang.String str24 = grantPayment0.processPayment((double) 10L);
        java.lang.String str26 = grantPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str18, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str20, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str22, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str24, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str26, "Deducting $1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
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
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str22 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str24 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str26 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str28 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str30 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str32 = creditCardPayment0.processPayment(1.0d);
        java.lang.String str34 = creditCardPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str24, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str26, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str28, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str30, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str32, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str34, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str10 = institutionalPayment0.processPayment((double) '#');
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str16 = institutionalPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $35.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $35.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $20.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str16 = debitCardPayment0.processPayment(1.0d);
        java.lang.Class<?> wildcardClass17 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
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
        java.lang.Class<?> wildcardClass13 = studentPricing0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = grantPayment0.processPayment((double) 1);
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) (byte) 1);
        java.lang.String str14 = grantPayment0.processPayment((double) 100);
        java.lang.String str16 = grantPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str12, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str16, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str14, "Processing credit card payment of $53.04 plus 2% processing fee.");
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = grantPayment0.processPayment((double) 'a');
        java.lang.String str10 = grantPayment0.processPayment((double) 10L);
        java.lang.String str12 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str14 = grantPayment0.processPayment(20.0d);
        java.lang.String str16 = grantPayment0.processPayment((double) 10);
        java.lang.String str18 = grantPayment0.processPayment((double) 0L);
        java.lang.String str20 = grantPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str8, "Deducting $97.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str14, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str16, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str18, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str20, "Deducting $20.00 from registered Research Grant funds.");
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str8 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str10 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str14 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str6, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str10, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment(10.0d);
        java.lang.String str6 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str8 = grantPayment0.processPayment(20.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str4, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str6, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str8, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 0);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str20 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str22 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str24 = institutionalPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str24, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str10 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = creditCardPayment0.processPayment((double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str6, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str14, "Processing credit card payment of $53.04 plus 2% processing fee.");
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
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
        double double18 = researcherPricing0.calculateRate();
        double double19 = researcherPricing0.calculateRate();
        double double20 = researcherPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str12 = grantPayment0.processPayment((double) 100);
        java.lang.Class<?> wildcardClass13 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str18 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.String str24 = creditCardPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str22, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str24, "Processing credit card payment of $32.64 plus 2% processing fee.");
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str14 = debitCardPayment0.processPayment(30.0d);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str18 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str20 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str22 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str24 = debitCardPayment0.processPayment((double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str10, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str14, "Processing direct debit payment of $30.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str20, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str22, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str24, "Processing direct debit payment of $52.00. No extra fees.");
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str14 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str16 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str20 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str22 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
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
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str18 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str22 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str24 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str26 = creditCardPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str22, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str24, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str26, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str12 = institutionalPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str18 = institutionalPayment0.processPayment(10.0d);
        java.lang.Class<?> wildcardClass19 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str18 = grantPayment0.processPayment((-1.0d));
        java.lang.String str20 = grantPayment0.processPayment((double) (byte) 10);
        java.lang.String str22 = grantPayment0.processPayment((double) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str14, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str18, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str20, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str22, "Deducting $97.00 from registered Research Grant funds.");
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100L);
        java.lang.String str6 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) '#');
        java.lang.String str10 = grantPayment0.processPayment((double) '4');
        java.lang.String str12 = grantPayment0.processPayment((double) 0);
        java.lang.String str14 = grantPayment0.processPayment((double) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str8, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str10, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str12, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $97.00 from registered Research Grant funds." + "'", str14, "Deducting $97.00 from registered Research Grant funds.");
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str8 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str16 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str18 = debitCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str14, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str18, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str12 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        app.GuestPricing guestPricing0 = new app.GuestPricing();
        double double1 = guestPricing0.calculateRate();
        double double2 = guestPricing0.calculateRate();
        double double3 = guestPricing0.calculateRate();
        double double4 = guestPricing0.calculateRate();
        double double5 = guestPricing0.calculateRate();
        double double6 = guestPricing0.calculateRate();
        double double7 = guestPricing0.calculateRate();
        double double8 = guestPricing0.calculateRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str12 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str14 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str16 = creditCardPayment0.processPayment((double) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str12, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str14, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str16, "Processing credit card payment of $35.70 plus 2% processing fee.");
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) '4');
        java.lang.String str12 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str16 = debitCardPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str10, "Processing direct debit payment of $52.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str16, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str18 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str18, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1));
        java.lang.Class<?> wildcardClass11 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str16 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str18 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str20 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str22 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str24 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str26 = debitCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str12, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str18, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str20, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str22, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str24, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str26, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 1);
        java.lang.String str12 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = debitCardPayment0.processPayment((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str6, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str8 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) -1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str14 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str16 = debitCardPayment0.processPayment((double) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str4, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str8, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str14, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str16, "Processing direct debit payment of $10.00. No extra fees.");
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str14 = creditCardPayment0.processPayment(1.0d);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str8, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) '#');
        java.lang.String str12 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str14 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str18 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $35.70 plus 2% processing fee." + "'", str10, "Processing credit card payment of $35.70 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str12, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (byte) 1);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (short) 10);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str14 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = creditCardPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str10, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str16, "Processing credit card payment of $32.64 plus 2% processing fee.");
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
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
        double double18 = researcherPricing0.calculateRate();
        double double19 = researcherPricing0.calculateRate();
        java.lang.Class<?> wildcardClass20 = researcherPricing0.getClass();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) '4');
        java.lang.String str14 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.Class<?> wildcardClass15 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str12, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
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
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str4 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str6 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment(15.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $15.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $10.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
        double double19 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str10 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0.0f);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str10, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str20, "Processing credit card payment of $32.64 plus 2% processing fee.");
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
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
        java.lang.String str22 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str24 = creditCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str26 = creditCardPayment0.processPayment((double) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str22, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str26, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment(30.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $30.00. No extra fees." + "'", str12, "Processing direct debit payment of $30.00. No extra fees.");
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
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
        double double13 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str8 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = debitCardPayment0.processPayment(0.0d);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
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
        double double13 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str8 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str10 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str12 = institutionalPayment0.processPayment(15.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $15.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $15.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str10 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str12 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str14 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str16 = institutionalPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 1.0f);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str16 = creditCardPayment0.processPayment(20.0d);
        java.lang.String str18 = creditCardPayment0.processPayment(1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str14, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $20.40 plus 2% processing fee." + "'", str16, "Processing credit card payment of $20.40 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str18, "Processing credit card payment of $1.02 plus 2% processing fee.");
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str16 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str18 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str20 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.Class<?> wildcardClass21 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str18 = debitCardPayment0.processPayment((double) 1L);
        java.lang.String str20 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str22 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str24 = debitCardPayment0.processPayment((double) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str14, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str18, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str20, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str22, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str24, "Processing direct debit payment of $52.00. No extra fees.");
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
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
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
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
        double double18 = researcherPricing0.calculateRate();
        double double19 = researcherPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str4, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str10, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) ' ');
        java.lang.String str10 = grantPayment0.processPayment(10.0d);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = grantPayment0.processPayment((double) 100);
        java.lang.String str18 = grantPayment0.processPayment(0.0d);
        java.lang.String str20 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str22 = grantPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str8, "Deducting $32.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str10, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str16, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str18, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str20, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str22, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        double double17 = studentPricing0.calculateRate();
        double double18 = studentPricing0.calculateRate();
        double double19 = studentPricing0.calculateRate();
        double double20 = studentPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        java.lang.Class<?> wildcardClass16 = facultyPricing0.getClass();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment(30.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) 100);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1));
        java.lang.String str12 = grantPayment0.processPayment(10.0d);
        java.lang.String str14 = grantPayment0.processPayment((double) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str6, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str8, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $32.00 from registered Research Grant funds." + "'", str14, "Deducting $32.00 from registered Research Grant funds.");
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = grantPayment0.processPayment(0.0d);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str14 = grantPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str8, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str14, "Deducting $10.00 from registered Research Grant funds.");
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
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
        double double12 = facultyPricing0.calculateRate();
        double double13 = facultyPricing0.calculateRate();
        double double14 = facultyPricing0.calculateRate();
        double double15 = facultyPricing0.calculateRate();
        double double16 = facultyPricing0.calculateRate();
        double double17 = facultyPricing0.calculateRate();
        double double18 = facultyPricing0.calculateRate();
        double double19 = facultyPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 15.0d + "'", double19 == 15.0d);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
        double double17 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = grantPayment0.processPayment((double) 1L);
        java.lang.String str10 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str12 = grantPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str10, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment((double) 100);
        java.lang.String str8 = grantPayment0.processPayment((double) 1.0f);
        java.lang.String str10 = grantPayment0.processPayment((double) (-1));
        java.lang.String str12 = grantPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = grantPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass15 = grantPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str6, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str8, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str12, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment((-1.0d));
        java.lang.String str8 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str8, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str10, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
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
        double double13 = studentPricing0.calculateRate();
        double double14 = studentPricing0.calculateRate();
        double double15 = studentPricing0.calculateRate();
        double double16 = studentPricing0.calculateRate();
        java.lang.Class<?> wildcardClass17 = studentPricing0.getClass();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
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
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str14 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str16 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.Class<?> wildcardClass17 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) 0);
        java.lang.String str12 = debitCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str8, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str10, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 0);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str16 = institutionalPayment0.processPayment(100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
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
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment((double) 10L);
        java.lang.String str4 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = grantPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str2, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str4, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1L));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str12 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str14 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str18 = institutionalPayment0.processPayment(0.0d);
        java.lang.Class<?> wildcardClass19 = institutionalPayment0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str6 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str8 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str6, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str8, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str12 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = debitCardPayment0.processPayment((double) '4');
        java.lang.String str16 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str18 = debitCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str20 = debitCardPayment0.processPayment(15.0d);
        java.lang.String str22 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str24 = debitCardPayment0.processPayment((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str12, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $52.00. No extra fees." + "'", str14, "Processing direct debit payment of $52.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str18, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str20, "Processing direct debit payment of $15.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str22, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str24, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 10L);
        java.lang.String str10 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str12 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str14 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str16 = institutionalPayment0.processPayment((double) (short) 0);
        java.lang.String str18 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str20 = institutionalPayment0.processPayment((double) 0);
        java.lang.String str22 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str6 = creditCardPayment0.processPayment(1.0d);
        java.lang.String str8 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str12 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str14 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str4, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str8, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str12, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $-1.02 plus 2% processing fee.");
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100);
        java.lang.String str8 = debitCardPayment0.processPayment((double) '#');
        java.lang.String str10 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str12 = debitCardPayment0.processPayment(1.0d);
        java.lang.String str14 = debitCardPayment0.processPayment(15.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str2, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $35.00. No extra fees." + "'", str8, "Processing direct debit payment of $35.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $15.00. No extra fees." + "'", str14, "Processing direct debit payment of $15.00. No extra fees.");
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment((double) 0.0f);
        java.lang.String str4 = grantPayment0.processPayment((double) (byte) 0);
        java.lang.String str6 = grantPayment0.processPayment(0.0d);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1L));
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str4, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = creditCardPayment0.processPayment(1.0d);
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str18 = creditCardPayment0.processPayment((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str4, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str12, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) (short) 100);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 0L);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str14 = debitCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str12, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str14, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1.0f);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = debitCardPayment0.processPayment((double) ' ');
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str2, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str8, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $32.00. No extra fees." + "'", str12, "Processing direct debit payment of $32.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 1);
        java.lang.String str8 = grantPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = grantPayment0.processPayment((-1.0d));
        java.lang.String str12 = grantPayment0.processPayment((double) 10L);
        java.lang.String str14 = grantPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = grantPayment0.processPayment((double) (short) -1);
        java.lang.String str18 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str20 = grantPayment0.processPayment(20.0d);
        java.lang.String str22 = grantPayment0.processPayment((double) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $1.00 from registered Research Grant funds." + "'", str6, "Deducting $1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str8, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str16, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str18, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str20, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str22, "Deducting $-1.00 from registered Research Grant funds.");
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str6 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str12 = institutionalPayment0.processPayment((-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment(10.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1.0f));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str16 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str8, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str16, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) 1);
        java.lang.String str10 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str12 = institutionalPayment0.processPayment((double) 'a');
        java.lang.String str14 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str16 = institutionalPayment0.processPayment((double) 0.0f);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str20 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str22 = institutionalPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $97.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $97.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $0.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
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
        java.lang.String str20 = grantPayment0.processPayment((double) '#');
        java.lang.String str22 = grantPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $30.00 from registered Research Grant funds." + "'", str10, "Deducting $30.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str12, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str14, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str16, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str18, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str20, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str22, "Deducting $0.00 from registered Research Grant funds.");
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str16 = creditCardPayment0.processPayment((double) 1L);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str20 = creditCardPayment0.processPayment(10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str16, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 100);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str18 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 0L);
        java.lang.String str22 = creditCardPayment0.processPayment((double) 100.0f);
        java.lang.String str24 = creditCardPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str14, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str18, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str20, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str4 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str10 = institutionalPayment0.processPayment((double) 1L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str16 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str18 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str20 = institutionalPayment0.processPayment((-1.0d));
        java.lang.String str22 = institutionalPayment0.processPayment(20.0d);
        java.lang.String str24 = institutionalPayment0.processPayment((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str22, "Charging $20.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str24, "Charging $1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str4 = institutionalPayment0.processPayment(30.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100.0f);
        java.lang.String str8 = institutionalPayment0.processPayment((double) (-1.0f));
        java.lang.String str10 = institutionalPayment0.processPayment((double) 0L);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (byte) 1);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str16 = institutionalPayment0.processPayment(20.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $30.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $30.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $20.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $20.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
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
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
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
        double double18 = researcherPricing0.calculateRate();
        double double19 = researcherPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
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
        double double13 = guestPricing0.calculateRate();
        double double14 = guestPricing0.calculateRate();
        double double15 = guestPricing0.calculateRate();
        double double16 = guestPricing0.calculateRate();
        double double17 = guestPricing0.calculateRate();
        double double18 = guestPricing0.calculateRate();
        double double19 = guestPricing0.calculateRate();
        double double20 = guestPricing0.calculateRate();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) '4');
        java.lang.String str4 = institutionalPayment0.processPayment(0.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) (short) 10);
        java.lang.String str8 = institutionalPayment0.processPayment((double) ' ');
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (short) 100);
        java.lang.String str14 = institutionalPayment0.processPayment((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $52.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $52.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $0.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $0.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $32.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $32.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $-1.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((-1.0d));
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 0.0f);
        java.lang.String str8 = debitCardPayment0.processPayment((double) (byte) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = debitCardPayment0.processPayment(20.0d);
        java.lang.String str14 = debitCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = debitCardPayment0.processPayment(100.0d);
        java.lang.String str20 = debitCardPayment0.processPayment((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str2, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str6, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $20.00. No extra fees." + "'", str12, "Processing direct debit payment of $20.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str14, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str16, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str18, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str20, "Processing direct debit payment of $1.00. No extra fees.");
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
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
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) (short) 0);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 10);
        java.lang.String str10 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str14 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str4, "Processing direct debit payment of $0.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str6, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str8, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str10, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str12, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(20.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) '4');
        java.lang.String str6 = grantPayment0.processPayment((double) '#');
        java.lang.String str8 = grantPayment0.processPayment((double) 10L);
        java.lang.String str10 = grantPayment0.processPayment((double) (byte) -1);
        java.lang.String str12 = grantPayment0.processPayment(15.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $20.00 from registered Research Grant funds." + "'", str2, "Deducting $20.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str4, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $35.00 from registered Research Grant funds." + "'", str6, "Deducting $35.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $10.00 from registered Research Grant funds." + "'", str8, "Deducting $10.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $-1.00 from registered Research Grant funds." + "'", str10, "Deducting $-1.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $15.00 from registered Research Grant funds." + "'", str12, "Deducting $15.00 from registered Research Grant funds.");
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str10 = debitCardPayment0.processPayment((double) (-1));
        java.lang.String str12 = debitCardPayment0.processPayment((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str6, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str8, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $-1.00. No extra fees." + "'", str10, "Processing direct debit payment of $-1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str12, "Processing direct debit payment of $100.00. No extra fees.");
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str10 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str12 = creditCardPayment0.processPayment((double) (short) 0);
        java.lang.String str14 = creditCardPayment0.processPayment(30.0d);
        java.lang.String str16 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str8, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str10, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $30.60 plus 2% processing fee." + "'", str14, "Processing credit card payment of $30.60 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment((double) 100);
        java.lang.String str4 = creditCardPayment0.processPayment((double) '4');
        java.lang.String str6 = creditCardPayment0.processPayment((double) (-1L));
        java.lang.String str8 = creditCardPayment0.processPayment(15.0d);
        java.lang.String str10 = creditCardPayment0.processPayment((double) 0);
        java.lang.String str12 = creditCardPayment0.processPayment((double) (-1));
        java.lang.String str14 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str16 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str18 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str20 = creditCardPayment0.processPayment((double) 10);
        java.lang.String str22 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str24 = creditCardPayment0.processPayment(0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $53.04 plus 2% processing fee." + "'", str4, "Processing credit card payment of $53.04 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str6, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $15.30 plus 2% processing fee." + "'", str8, "Processing credit card payment of $15.30 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str10, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str12, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str14, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str16, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str20, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str22, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $0.00 plus 2% processing fee.");
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        app.CreditCardPayment creditCardPayment0 = new app.CreditCardPayment();
        java.lang.String str2 = creditCardPayment0.processPayment(0.0d);
        java.lang.String str4 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str6 = creditCardPayment0.processPayment((double) 10.0f);
        java.lang.String str8 = creditCardPayment0.processPayment((double) ' ');
        java.lang.String str10 = creditCardPayment0.processPayment((double) 'a');
        java.lang.String str12 = creditCardPayment0.processPayment((double) 100L);
        java.lang.String str14 = creditCardPayment0.processPayment((double) 10L);
        java.lang.String str16 = creditCardPayment0.processPayment((double) (byte) 100);
        java.lang.String str18 = creditCardPayment0.processPayment(100.0d);
        java.lang.String str20 = creditCardPayment0.processPayment((double) (byte) -1);
        java.lang.String str22 = creditCardPayment0.processPayment((double) (short) 1);
        java.lang.String str24 = creditCardPayment0.processPayment((double) 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing credit card payment of $0.00 plus 2% processing fee." + "'", str2, "Processing credit card payment of $0.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str4, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str6, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing credit card payment of $32.64 plus 2% processing fee." + "'", str8, "Processing credit card payment of $32.64 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing credit card payment of $98.94 plus 2% processing fee." + "'", str10, "Processing credit card payment of $98.94 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str12, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing credit card payment of $10.20 plus 2% processing fee." + "'", str14, "Processing credit card payment of $10.20 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str16, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str18, "Processing credit card payment of $102.00 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Processing credit card payment of $-1.02 plus 2% processing fee." + "'", str20, "Processing credit card payment of $-1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Processing credit card payment of $1.02 plus 2% processing fee." + "'", str22, "Processing credit card payment of $1.02 plus 2% processing fee.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Processing credit card payment of $102.00 plus 2% processing fee." + "'", str24, "Processing credit card payment of $102.00 plus 2% processing fee.");
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        app.InstitutionalPayment institutionalPayment0 = new app.InstitutionalPayment();
        java.lang.String str2 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str4 = institutionalPayment0.processPayment(10.0d);
        java.lang.String str6 = institutionalPayment0.processPayment((double) 100L);
        java.lang.String str8 = institutionalPayment0.processPayment((-1.0d));
        java.lang.String str10 = institutionalPayment0.processPayment((double) (byte) 100);
        java.lang.String str12 = institutionalPayment0.processPayment((double) (-1));
        java.lang.String str14 = institutionalPayment0.processPayment(100.0d);
        java.lang.String str16 = institutionalPayment0.processPayment(1.0d);
        java.lang.String str18 = institutionalPayment0.processPayment((double) (short) -1);
        java.lang.String str20 = institutionalPayment0.processPayment((double) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str2, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Charging $10.00 to University Department Account. Pending Dean approval." + "'", str4, "Charging $10.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str6, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str8, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str10, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str12, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str14, "Charging $100.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Charging $1.00 to University Department Account. Pending Dean approval." + "'", str16, "Charging $1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Charging $-1.00 to University Department Account. Pending Dean approval." + "'", str18, "Charging $-1.00 to University Department Account. Pending Dean approval.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Charging $100.00 to University Department Account. Pending Dean approval." + "'", str20, "Charging $100.00 to University Department Account. Pending Dean approval.");
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
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
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
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
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        app.DebitCardPayment debitCardPayment0 = new app.DebitCardPayment();
        java.lang.String str2 = debitCardPayment0.processPayment((double) 100.0f);
        java.lang.String str4 = debitCardPayment0.processPayment((double) 1);
        java.lang.String str6 = debitCardPayment0.processPayment((double) 10L);
        java.lang.String str8 = debitCardPayment0.processPayment((double) 'a');
        java.lang.String str10 = debitCardPayment0.processPayment((double) 100L);
        java.lang.String str12 = debitCardPayment0.processPayment((double) 10.0f);
        java.lang.String str14 = debitCardPayment0.processPayment(10.0d);
        java.lang.String str16 = debitCardPayment0.processPayment((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str2, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Processing direct debit payment of $1.00. No extra fees." + "'", str4, "Processing direct debit payment of $1.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str6, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Processing direct debit payment of $97.00. No extra fees." + "'", str8, "Processing direct debit payment of $97.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Processing direct debit payment of $100.00. No extra fees." + "'", str10, "Processing direct debit payment of $100.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str12, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Processing direct debit payment of $10.00. No extra fees." + "'", str14, "Processing direct debit payment of $10.00. No extra fees.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Processing direct debit payment of $0.00. No extra fees." + "'", str16, "Processing direct debit payment of $0.00. No extra fees.");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        app.GrantPayment grantPayment0 = new app.GrantPayment();
        java.lang.String str2 = grantPayment0.processPayment(0.0d);
        java.lang.String str4 = grantPayment0.processPayment((double) 100);
        java.lang.String str6 = grantPayment0.processPayment((double) (short) 0);
        java.lang.String str8 = grantPayment0.processPayment((double) '4');
        java.lang.String str10 = grantPayment0.processPayment((double) 100.0f);
        java.lang.String str12 = grantPayment0.processPayment((double) 100L);
        java.lang.String str14 = grantPayment0.processPayment((double) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str2, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str4, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str6, "Deducting $0.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deducting $52.00 from registered Research Grant funds." + "'", str8, "Deducting $52.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str10, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Deducting $100.00 from registered Research Grant funds." + "'", str12, "Deducting $100.00 from registered Research Grant funds.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deducting $0.00 from registered Research Grant funds." + "'", str14, "Deducting $0.00 from registered Research Grant funds.");
    }
}

