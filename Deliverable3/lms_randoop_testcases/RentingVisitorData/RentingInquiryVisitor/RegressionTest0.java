import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        ItemsData.CD cD1 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        ItemsData.Magazine magazine1 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        ItemsData.Book book1 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.Class<?> wildcardClass1 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass2 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass3 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass4 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass5 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass6 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass8 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Book book8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitBook(book8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass9 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass7 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str9 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str10 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.CD cD11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitCD(cD11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str9, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str10, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str9 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str10 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str9, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str10, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str9 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.Class<?> wildcardClass10 = rentingInquiryVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str9, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        RentingVisitorData.RentingInquiryVisitor rentingInquiryVisitor0 = new RentingVisitorData.RentingInquiryVisitor();
        java.lang.String str1 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str2 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str3 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str4 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str5 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str6 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str7 = rentingInquiryVisitor0.displayRentingInquiry();
        java.lang.String str8 = rentingInquiryVisitor0.displayRentingInquiry();
        ItemsData.Magazine magazine9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rentingInquiryVisitor0.visitMagazine(magazine9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str1, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str2, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str3, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str4, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str5, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str6, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str7, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n" + "'", str8, "Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n");
    }
}

