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
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        java.lang.Class<?> wildcardClass5 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        java.lang.Class<?> wildcardClass9 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        java.lang.Class<?> wildcardClass7 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        java.lang.Class<?> wildcardClass13 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        java.lang.Class<?> wildcardClass11 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("hi!");
        java.lang.Class<?> wildcardClass13 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = user14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("hi!");
        java.lang.Class<?> wildcardClass7 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = user12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("hi!");
        UserData.User user8 = userFactory0.createuser("hi!");
        UserData.User user10 = userFactory0.createuser("");
        UserData.User user12 = userFactory0.createuser("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("");
        java.lang.Class<?> wildcardClass11 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("");
        UserData.User user16 = userFactory0.createuser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = user16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        java.lang.Class<?> wildcardClass3 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("");
        UserData.User user12 = userFactory0.createuser("");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("hi!");
        UserData.User user8 = userFactory0.createuser("hi!");
        UserData.User user10 = userFactory0.createuser("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("");
        UserData.User user16 = userFactory0.createuser("hi!");
        UserData.User user18 = userFactory0.createuser("");
        UserData.User user20 = userFactory0.createuser("");
        java.lang.Class<?> wildcardClass21 = userFactory0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = user14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("");
        UserData.User user16 = userFactory0.createuser("hi!");
        UserData.User user18 = userFactory0.createuser("");
        UserData.User user20 = userFactory0.createuser("");
        UserData.User user22 = userFactory0.createuser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = user22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("hi!");
        UserData.User user16 = userFactory0.createuser("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("");
        UserData.User user12 = userFactory0.createuser("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = user12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = user10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("");
        UserData.User user16 = userFactory0.createuser("hi!");
        UserData.User user18 = userFactory0.createuser("");
        UserData.User user20 = userFactory0.createuser("hi!");
        UserData.User user22 = userFactory0.createuser("hi!");
        UserData.User user24 = userFactory0.createuser("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        UserData.UserFactory userFactory0 = new UserData.UserFactory();
        UserData.User user2 = userFactory0.createuser("hi!");
        UserData.User user4 = userFactory0.createuser("");
        UserData.User user6 = userFactory0.createuser("");
        UserData.User user8 = userFactory0.createuser("");
        UserData.User user10 = userFactory0.createuser("hi!");
        UserData.User user12 = userFactory0.createuser("");
        UserData.User user14 = userFactory0.createuser("");
        UserData.User user16 = userFactory0.createuser("");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user16);
    }
}

