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
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.Class<?> wildcardClass1 = payment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.Class<?> wildcardClass5 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentMethod();
        java.lang.Class<?> wildcardClass2 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        java.lang.Class<?> wildcardClass6 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        java.lang.Class<?> wildcardClass3 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        float float6 = payment0.getAmount();
        java.lang.String str7 = payment0.getPaymentMethod();
        float float8 = payment0.getAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        payment0.setAmount((float) '#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentMethod();
        java.lang.String str2 = payment0.getPaymentID();
        java.lang.Class<?> wildcardClass3 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentMethod();
        java.lang.String str2 = payment0.getPaymentID();
        payment0.setPaymentMethod("hi!");
        java.lang.String str5 = payment0.getPaymentID();
        java.lang.Class<?> wildcardClass6 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        float float6 = payment0.getAmount();
        java.lang.String str7 = payment0.getPaymentMethod();
        java.lang.Class<?> wildcardClass8 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentMethod();
        java.lang.String str2 = payment0.getPaymentID();
        payment0.setPaymentMethod("hi!");
        java.lang.String str5 = payment0.getPaymentID();
        payment0.setAmount((float) 0L);
        java.lang.String str8 = payment0.getPaymentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        java.lang.String str3 = payment0.getPaymentMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentMethod();
        payment0.setPaymentID("hi!");
        payment0.setAmount((-1.0f));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        java.lang.String str6 = payment0.getPaymentMethod();
        java.lang.Class<?> wildcardClass7 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        payment0.setPaymentID("");
        payment0.setPaymentID("hi!");
        payment0.setPaymentID("");
        payment0.setPaymentMethod("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        float float6 = payment0.getAmount();
        payment0.setPaymentMethod("hi!");
        java.lang.String str9 = payment0.getPaymentMethod();
        float float10 = payment0.getAmount();
        payment0.setAmount((float) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentMethod();
        java.lang.String str2 = payment0.getPaymentID();
        payment0.setPaymentMethod("hi!");
        java.lang.String str5 = payment0.getPaymentID();
        payment0.setAmount((float) 0L);
        java.lang.String str8 = payment0.getPaymentMethod();
        payment0.setPaymentMethod("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        java.lang.String str6 = payment0.getPaymentMethod();
        payment0.setPaymentID("");
        payment0.setPaymentMethod("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        float float6 = payment0.getAmount();
        payment0.setPaymentMethod("hi!");
        java.lang.String str9 = payment0.getPaymentMethod();
        float float10 = payment0.getAmount();
        payment0.setPaymentID("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        payment0.setPaymentMethod("");
        payment0.setAmount(0.0f);
        java.lang.Class<?> wildcardClass10 = payment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        payment0.setAmount((float) 'a');
        java.lang.String str3 = payment0.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        payment0.setPaymentID("hi!");
        java.lang.String str5 = payment0.getPaymentMethod();
        float float6 = payment0.getAmount();
        payment0.setPaymentMethod("hi!");
        payment0.setPaymentMethod("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        PaymentSystem.Payment payment0 = new PaymentSystem.Payment();
        java.lang.String str1 = payment0.getPaymentID();
        float float2 = payment0.getAmount();
        java.lang.String str3 = payment0.getPaymentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(str3);
    }
}

