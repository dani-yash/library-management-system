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
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        java.lang.Class<?> wildcardClass1 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        java.lang.Class<?> wildcardClass3 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        NotificationSystem.Notification notification2 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user1, notification2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        NotificationSystem.Notification notification4 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user3, notification4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        NotificationSystem.Notification notification6 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user5, notification6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        NotificationSystem.Notification notification10 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user9, notification10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        java.lang.Class<?> wildcardClass7 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        java.lang.Class<?> wildcardClass9 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        NotificationSystem.Notification notification8 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user7, notification8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        NotificationSystem.Notification notification12 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user11, notification12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        java.lang.Class<?> wildcardClass5 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        java.lang.Class<?> wildcardClass11 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        java.lang.Class<?> wildcardClass13 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        NotificationSystem.Notification notification16 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user15, notification16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        java.lang.Class<?> wildcardClass15 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        NotificationSystem.Notification notification18 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user17, notification18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        NotificationSystem.Notification notification14 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user13, notification14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        java.lang.Class<?> wildcardClass19 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        java.lang.Class<?> wildcardClass17 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        java.lang.Class<?> wildcardClass21 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        NotificationSystem.Notification notification20 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user19, notification20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        NotificationSystem.Notification notification22 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user21, notification22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        UserData.User user25 = null;
        NotificationSystem.Notification notification26 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user25, notification26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        java.lang.Class<?> wildcardClass25 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        NotificationSystem.Notification notification24 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user23, notification24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        UserData.User user25 = null;
        notificationSystem0.notifyOverdueBooks(user25);
        UserData.User user27 = null;
        NotificationSystem.Notification notification28 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user27, notification28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        UserData.User user25 = null;
        notificationSystem0.notifyOverdueBooks(user25);
        UserData.User user27 = null;
        notificationSystem0.notifyOverdueBooks(user27);
        java.lang.Class<?> wildcardClass29 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        UserData.User user25 = null;
        notificationSystem0.notifyOverdueBooks(user25);
        UserData.User user27 = null;
        notificationSystem0.notifyOverdueBooks(user27);
        UserData.User user29 = null;
        NotificationSystem.Notification notification30 = null;
        // The following exception was thrown during execution in test generation
        try {
            notificationSystem0.sendNotification(user29, notification30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        java.lang.Class<?> wildcardClass23 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        UserData.User user25 = null;
        notificationSystem0.notifyOverdueBooks(user25);
        java.lang.Class<?> wildcardClass27 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        NotificationSystem.NotificationSystem notificationSystem0 = new NotificationSystem.NotificationSystem();
        UserData.User user1 = null;
        notificationSystem0.notifyOverdueBooks(user1);
        UserData.User user3 = null;
        notificationSystem0.notifyOverdueBooks(user3);
        UserData.User user5 = null;
        notificationSystem0.notifyOverdueBooks(user5);
        UserData.User user7 = null;
        notificationSystem0.notifyOverdueBooks(user7);
        UserData.User user9 = null;
        notificationSystem0.notifyOverdueBooks(user9);
        UserData.User user11 = null;
        notificationSystem0.notifyOverdueBooks(user11);
        UserData.User user13 = null;
        notificationSystem0.notifyOverdueBooks(user13);
        UserData.User user15 = null;
        notificationSystem0.notifyOverdueBooks(user15);
        UserData.User user17 = null;
        notificationSystem0.notifyOverdueBooks(user17);
        UserData.User user19 = null;
        notificationSystem0.notifyOverdueBooks(user19);
        UserData.User user21 = null;
        notificationSystem0.notifyOverdueBooks(user21);
        UserData.User user23 = null;
        notificationSystem0.notifyOverdueBooks(user23);
        UserData.User user25 = null;
        notificationSystem0.notifyOverdueBooks(user25);
        UserData.User user27 = null;
        notificationSystem0.notifyOverdueBooks(user27);
        UserData.User user29 = null;
        notificationSystem0.notifyOverdueBooks(user29);
        UserData.User user31 = null;
        notificationSystem0.notifyOverdueBooks(user31);
        UserData.User user33 = null;
        notificationSystem0.notifyOverdueBooks(user33);
        java.lang.Class<?> wildcardClass35 = notificationSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }
}

