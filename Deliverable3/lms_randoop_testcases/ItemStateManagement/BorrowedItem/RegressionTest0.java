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
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.lang.Class<?> wildcardClass1 = borrowedItem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass3 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = date2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = date1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass2 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = date3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass4 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass5 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass6 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = date5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = date8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass8 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass7 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = date4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = date7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass9 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = date6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = date10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass10 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = date9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = date11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = date12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.util.Date date13 = borrowedItem0.getDueDate();
        java.util.Date date14 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = date14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.util.Date date13 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = date13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass11 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass13 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass12 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.util.Date date13 = borrowedItem0.getDueDate();
        java.util.Date date14 = borrowedItem0.getDueDate();
        java.util.Date date15 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = date15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.util.Date date13 = borrowedItem0.getDueDate();
        java.util.Date date14 = borrowedItem0.getDueDate();
        java.lang.Class<?> wildcardClass15 = borrowedItem0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.util.Date date13 = borrowedItem0.getDueDate();
        java.util.Date date14 = borrowedItem0.getDueDate();
        java.util.Date date15 = borrowedItem0.getDueDate();
        java.util.Date date16 = borrowedItem0.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = date16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        ItemStateManagement.BorrowedItem borrowedItem0 = new ItemStateManagement.BorrowedItem();
        java.util.Date date1 = borrowedItem0.getDueDate();
        java.util.Date date2 = borrowedItem0.getDueDate();
        java.util.Date date3 = borrowedItem0.getDueDate();
        java.util.Date date4 = borrowedItem0.getDueDate();
        java.util.Date date5 = borrowedItem0.getDueDate();
        java.util.Date date6 = borrowedItem0.getDueDate();
        java.util.Date date7 = borrowedItem0.getDueDate();
        java.util.Date date8 = borrowedItem0.getDueDate();
        java.util.Date date9 = borrowedItem0.getDueDate();
        java.util.Date date10 = borrowedItem0.getDueDate();
        java.util.Date date11 = borrowedItem0.getDueDate();
        java.util.Date date12 = borrowedItem0.getDueDate();
        java.util.Date date13 = borrowedItem0.getDueDate();
        java.util.Date date14 = borrowedItem0.getDueDate();
        java.util.Date date15 = borrowedItem0.getDueDate();
        java.util.Date date16 = borrowedItem0.getDueDate();
        java.util.Date date17 = borrowedItem0.getDueDate();
        java.util.Date date18 = borrowedItem0.getDueDate();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
    }
}

