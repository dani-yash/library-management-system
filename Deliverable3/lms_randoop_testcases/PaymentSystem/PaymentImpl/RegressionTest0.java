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
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 0L, "hi!");
        java.lang.Class<?> wildcardClass4 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 0L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = paymentImpl3.processPayment(user7, 0.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        java.lang.Class<?> wildcardClass4 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, 0.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        java.lang.Class<?> wildcardClass7 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1, "");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, 0.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = paymentImpl3.processPayment(user7, (float) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 0L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = paymentImpl3.processPayment(user7, (float) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, (float) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        PaymentSystem.Payment payment8 = null;
        paymentImpl3.storePaymentDetails(user7, payment8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (short) 1, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) 0, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        PaymentSystem.Payment payment8 = null;
        paymentImpl3.storePaymentDetails(user7, payment8);
        UserData.User user10 = null;
        PaymentSystem.Payment payment11 = null;
        paymentImpl3.storePaymentDetails(user10, payment11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (-1L), "");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1, "");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, (float) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 0, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) -1, "hi!");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, (float) 100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, (float) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (-1L), "");
        java.lang.Class<?> wildcardClass4 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 100.0f, "hi!");
        java.lang.Class<?> wildcardClass4 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) 1, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 0L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        PaymentSystem.Payment payment8 = null;
        paymentImpl3.storePaymentDetails(user7, payment8);
        java.lang.Class<?> wildcardClass10 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = paymentImpl3.processPayment(user7, (float) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) 0, "hi!");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, 0.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) 0, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        java.lang.Class<?> wildcardClass7 = paymentImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (short) -1, "");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, (-1.0f), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1L, "");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 1L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = paymentImpl3.processPayment(user7, (float) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) 0L, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        PaymentSystem.Payment payment8 = null;
        paymentImpl3.storePaymentDetails(user7, payment8);
        UserData.User user10 = null;
        PaymentSystem.Payment payment11 = null;
        paymentImpl3.storePaymentDetails(user10, payment11);
        UserData.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = paymentImpl3.processPayment(user13, (float) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 0.0f, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
        UserData.User user7 = null;
        PaymentSystem.Payment payment8 = null;
        paymentImpl3.storePaymentDetails(user7, payment8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) 10, "hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, 100.0f, "hi!");
        UserData.User user4 = null;
        PaymentSystem.Payment payment5 = null;
        paymentImpl3.storePaymentDetails(user4, payment5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        UserData.User user0 = null;
        PaymentSystem.PaymentImpl paymentImpl3 = new PaymentSystem.PaymentImpl(user0, (float) (byte) 0, "hi!");
        UserData.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = paymentImpl3.processPayment(user4, 0.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

