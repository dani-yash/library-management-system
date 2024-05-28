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
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = cD3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        cD3.setAmount((int) (byte) 1);
        cD3.setPrice((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        int int7 = cD3.getAmount();
        cD3.setPrice((int) ' ');
        java.lang.String str10 = cD3.getBarcode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        cD3.setPrice((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        cD3.setAmount((int) (byte) 1);
        int int11 = cD3.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        int int9 = cD3.getAmount();
        int int10 = cD3.getAmount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        cD3.setAmount((int) (short) 10);
        cD3.setPrice((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ItemsData.CD cD3 = new ItemsData.CD((int) (byte) 0, (int) (byte) -1, "hi!");
        int int4 = cD3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ItemsData.CD cD3 = new ItemsData.CD((int) (byte) 0, (int) (byte) -1, "hi!");
        java.lang.String str4 = cD3.getBarcode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ItemsData.CD cD3 = new ItemsData.CD((int) 'a', (int) (short) 1, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setAmount((-1));
        int int6 = cD3.getAmount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getAmount();
        java.lang.String str9 = cD3.getBarcode();
        cD3.setBarcode("hi!");
        cD3.setPrice((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ItemsData.CD cD3 = new ItemsData.CD((int) (short) -1, (int) (short) -1, "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        int int7 = cD3.getAmount();
        java.lang.String str8 = cD3.getBarcode();
        cD3.setPrice((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        cD3.setAmount((int) (byte) 1);
        cD3.setPrice(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        cD3.setAmount((int) (short) 10);
        cD3.setAmount((int) (byte) 1);
        java.lang.String str11 = cD3.getBarcode();
        cD3.setAmount((int) (byte) -1);
        int int14 = cD3.getAmount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getAmount();
        java.lang.String str9 = cD3.getBarcode();
        cD3.setBarcode("hi!");
        int int12 = cD3.getAmount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getAmount();
        cD3.setAmount((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ItemsData.CD cD3 = new ItemsData.CD((int) 'a', (int) (byte) 0, "");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getPrice();
        java.lang.Class<?> wildcardClass9 = cD3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ItemsData.CD cD3 = new ItemsData.CD((int) (byte) 0, (int) (byte) -1, "hi!");
        cD3.setBarcode("hi!");
        cD3.setAmount(10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        int int7 = cD3.getAmount();
        cD3.setPrice((int) ' ');
        cD3.setPrice((int) ' ');
        cD3.setBarcode("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getAmount();
        java.lang.String str9 = cD3.getBarcode();
        cD3.setBarcode("hi!");
        java.lang.Class<?> wildcardClass12 = cD3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        int int7 = cD3.getAmount();
        cD3.setAmount((-1));
        RentingVisitorData.RentingVisitor rentingVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD3.accept(rentingVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ItemsData.CD cD3 = new ItemsData.CD((int) (byte) 0, (int) (byte) -1, "hi!");
        int int4 = cD3.getAmount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getAmount();
        java.lang.String str9 = cD3.getBarcode();
        cD3.setAmount((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        java.lang.String str7 = cD3.getBarcode();
        int int8 = cD3.getAmount();
        cD3.setAmount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        ItemsData.CD cD3 = new ItemsData.CD(0, (int) (short) -1, "hi!");
        cD3.setPrice((int) '4');
        int int6 = cD3.getPrice();
        int int7 = cD3.getAmount();
        java.lang.String str8 = cD3.getBarcode();
        cD3.setBarcode("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }
}

