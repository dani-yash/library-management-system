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
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        RentingVisitorData.RentingVisitor rentingVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        ItemsData.Book book3 = new ItemsData.Book((int) (byte) -1, (int) '#', "");
        java.lang.String str4 = book3.getTitle();
        book3.setAmount((int) '4');
        book3.setPrice((int) '#');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("");
        RentingVisitorData.RentingVisitor rentingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        book3.setAmount((int) (short) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ItemsData.Book book3 = new ItemsData.Book((int) (byte) -1, (int) '#', "");
        java.lang.String str4 = book3.getTitle();
        RentingVisitorData.RentingVisitor rentingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        java.lang.String str4 = book3.getAuthor();
        RentingVisitorData.RentingVisitor rentingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        java.lang.Class<?> wildcardClass4 = book3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        book3.setBarcode("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        book3.setTitle("hi!");
        book3.setGenre("hi!");
        int int8 = book3.getAmount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("");
        book3.setPrice((int) (byte) 0);
        int int9 = book3.getPrice();
        java.lang.String str10 = book3.getGenre();
        book3.setAuthor("hi!");
        int int13 = book3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("");
        book3.setPrice((int) (byte) 0);
        int int9 = book3.getPrice();
        java.lang.String str10 = book3.getGenre();
        RentingVisitorData.RentingVisitor rentingVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ItemsData.Book book3 = new ItemsData.Book((int) (short) 1, (int) ' ', "hi!");
        book3.setAmount((int) (byte) -1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ItemsData.Book book3 = new ItemsData.Book((int) (short) 10, 52, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ItemsData.Book book3 = new ItemsData.Book((int) (byte) -1, (int) '#', "");
        java.lang.String str4 = book3.getTitle();
        book3.setAmount((int) '4');
        RentingVisitorData.RentingVisitor rentingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ItemsData.Book book3 = new ItemsData.Book((int) (byte) -1, (int) '#', "");
        java.lang.String str4 = book3.getTitle();
        book3.setAmount((int) '4');
        int int7 = book3.getAmount();
        RentingVisitorData.RentingVisitor rentingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            book3.accept(rentingVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        book3.setTitle("hi!");
        book3.setGenre("hi!");
        book3.setGenre("hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        java.lang.String str5 = book3.getAuthor();
        java.lang.String str6 = book3.getGenre();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("");
        book3.setPrice((int) (byte) 0);
        int int9 = book3.getPrice();
        java.lang.String str10 = book3.getGenre();
        book3.setPrice(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ItemsData.Book book3 = new ItemsData.Book((int) (short) 1, (int) ' ', "hi!");
        int int4 = book3.getAmount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("");
        book3.setPrice((int) (byte) 0);
        int int9 = book3.getPrice();
        java.lang.String str10 = book3.getGenre();
        book3.setAuthor("hi!");
        java.lang.String str13 = book3.getBarcode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        book3.setTitle("");
        book3.setPrice((int) (byte) 0);
        java.lang.String str9 = book3.getBarcode();
        java.lang.String str10 = book3.getGenre();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        ItemsData.Book book3 = new ItemsData.Book((int) (byte) -1, (int) '#', "");
        java.lang.String str4 = book3.getTitle();
        book3.setAmount((int) (byte) -1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ItemsData.Book book3 = new ItemsData.Book((int) (short) 1, (int) ' ', "hi!");
        java.lang.String str4 = book3.getTitle();
        java.lang.String str5 = book3.getAuthor();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ItemsData.Book book3 = new ItemsData.Book(52, 10, "hi!");
        java.lang.String str4 = book3.getTitle();
        int int5 = book3.getAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        ItemsData.Book book3 = new ItemsData.Book(52, 0, "hi!");
        int int4 = book3.getPrice();
        java.lang.String str5 = book3.getAuthor();
        java.lang.String str6 = book3.getAuthor();
        java.lang.String str7 = book3.getAuthor();
        java.lang.String str8 = book3.getBarcode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        ItemsData.Book book3 = new ItemsData.Book(52, 10, "hi!");
        book3.setAuthor("hi!");
        java.lang.String str6 = book3.getGenre();
        org.junit.Assert.assertNull(str6);
    }
}

