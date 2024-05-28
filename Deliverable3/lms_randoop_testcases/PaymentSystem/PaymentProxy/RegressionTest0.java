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
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        UserData.User user2 = null;
        PaymentSystem.Payment payment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProxy1.storePaymentDetails(user2, payment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        java.lang.Class<?> wildcardClass2 = paymentProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        java.lang.Class<?> wildcardClass3 = paymentProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        java.lang.Class<?> wildcardClass5 = paymentProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy2);
        java.lang.Class<?> wildcardClass4 = paymentProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        java.lang.Class<?> wildcardClass5 = paymentProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        java.lang.Class<?> wildcardClass4 = paymentProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        UserData.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = paymentProxy1.processPayment(user2, (float) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy(paymentInterface0);
        UserData.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = paymentProxy2.processPayment(user3, (float) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        java.lang.Class<?> wildcardClass6 = paymentProxy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy(paymentInterface0);
        UserData.User user3 = null;
        PaymentSystem.Payment payment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProxy2.storePaymentDetails(user3, payment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        java.lang.Class<?> wildcardClass6 = paymentProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy(paymentInterface0);
        java.lang.Class<?> wildcardClass3 = paymentProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy2);
        java.lang.Class<?> wildcardClass4 = paymentProxy2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        java.lang.Class<?> wildcardClass6 = paymentProxy5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        java.lang.Class<?> wildcardClass7 = paymentProxy6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        java.lang.Class<?> wildcardClass7 = paymentProxy4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy3);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy3);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy6);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy7);
        java.lang.Class<?> wildcardClass9 = paymentProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy6);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy7);
        PaymentSystem.PaymentProxy paymentProxy9 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy7);
        java.lang.Class<?> wildcardClass10 = paymentProxy9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy7);
        java.lang.Class<?> wildcardClass9 = paymentProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy6);
        java.lang.Class<?> wildcardClass8 = paymentProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy5);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy6);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy7);
        java.lang.Class<?> wildcardClass9 = paymentProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy3);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy3);
        java.lang.Class<?> wildcardClass6 = paymentProxy3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy7);
        PaymentSystem.PaymentProxy paymentProxy9 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy8);
        PaymentSystem.PaymentProxy paymentProxy10 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        java.lang.Class<?> wildcardClass8 = paymentProxy7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        java.lang.Class<?> wildcardClass9 = paymentProxy8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        PaymentSystem.PaymentInterface paymentInterface0 = null;
        PaymentSystem.PaymentProxy paymentProxy1 = new PaymentSystem.PaymentProxy(paymentInterface0);
        PaymentSystem.PaymentProxy paymentProxy2 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy3 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy4 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy1);
        PaymentSystem.PaymentProxy paymentProxy5 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy6 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy7 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy8 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
        PaymentSystem.PaymentProxy paymentProxy9 = new PaymentSystem.PaymentProxy((PaymentSystem.PaymentInterface) paymentProxy4);
    }
}

