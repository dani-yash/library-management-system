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
        java.util.List<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = SystemInventory.SystemInventory.itemList;
        org.junit.Assert.assertNull(physicalItemDetailsList0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.addItem(physicalItemDetails5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        java.lang.Class<?> wildcardClass5 = systemInventory4.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.manageItemDetails(0, "hi!", 1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item with ID 0 does not exist.");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.manageItemDetails((int) (byte) -1, "hi!", (int) (short) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item with ID -1 does not exist.");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem(0);
        SystemInventory.PhysicalItemDetails physicalItemDetails7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.addItem(physicalItemDetails7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem(0);
        SystemInventory.PhysicalItemDetails physicalItemDetails8 = systemInventory4.searchItem(0);
        SystemInventory.PhysicalItemDetails physicalItemDetails10 = systemInventory4.searchItem((int) (short) 10);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails8);
        org.junit.Assert.assertNull(physicalItemDetails10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory systemInventory5 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory5.addItem(physicalItemDetails6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        java.lang.Class<?> wildcardClass6 = physicalItemDetailsList1.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.List<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = null;
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList0;
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory6 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory6.removeItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            systemInventory6.manageItemDetails((int) (short) -1, "", (int) (byte) -1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item with ID -1 does not exist.");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory6 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory6.removeItem((int) (byte) 1);
        SystemInventory.PhysicalItemDetails physicalItemDetails9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory6.addItem(physicalItemDetails9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory6 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory6.removeItem(10);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem((int) (short) 0);
        SystemInventory.PhysicalItemDetails physicalItemDetails8 = systemInventory4.searchItem((int) (byte) 100);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory systemInventory5 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails7 = systemInventory5.searchItem((int) (short) -1);
        systemInventory5.removeItem((int) (byte) 100);
        SystemInventory.PhysicalItemDetails physicalItemDetails10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory5.addItem(physicalItemDetails10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = systemInventory4.searchItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.manageItemDetails((int) (byte) 100, "", (int) '4', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item with ID 100 does not exist.");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = systemInventory4.searchItem((int) '4');
        boolean boolean8 = systemInventory4.isItemAvailable((int) ' ');
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = systemInventory4.searchItem((int) (byte) 1);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem(0);
        java.lang.Class<?> wildcardClass7 = systemInventory4.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory6 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem(0);
        SystemInventory.PhysicalItemDetails physicalItemDetails8 = systemInventory4.searchItem(0);
        SystemInventory.PhysicalItemDetails physicalItemDetails9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.addItem(physicalItemDetails9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = systemInventory4.searchItem((int) '4');
        SystemInventory.PhysicalItemDetails physicalItemDetails8 = systemInventory4.searchItem(0);
        systemInventory4.removeItem((int) ' ');
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails6);
        org.junit.Assert.assertNull(physicalItemDetails8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem((int) (short) 0);
        systemInventory4.removeItem((int) (short) 10);
        SystemInventory.PhysicalItemDetails physicalItemDetails10 = systemInventory4.searchItem((int) (byte) 10);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory systemInventory5 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails7 = systemInventory5.searchItem((int) (short) -1);
        systemInventory5.removeItem((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            systemInventory5.manageItemDetails((int) (short) 1, "", (-1), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item with ID 1 does not exist.");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        java.lang.Class<?> wildcardClass7 = physicalItemDetailsList1.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory systemInventory5 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails7 = systemInventory5.searchItem((int) (short) -1);
        systemInventory5.removeItem((int) (byte) 100);
        SystemInventory.PhysicalItemDetails physicalItemDetails11 = systemInventory5.searchItem(10);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails7);
        org.junit.Assert.assertNull(physicalItemDetails11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = systemInventory4.searchItem((int) '4');
        SystemInventory.PhysicalItemDetails physicalItemDetails8 = systemInventory4.searchItem(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = physicalItemDetails8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails6);
        org.junit.Assert.assertNull(physicalItemDetails8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails6 = systemInventory4.searchItem((int) '4');
        SystemInventory.PhysicalItemDetails physicalItemDetails8 = systemInventory4.searchItem(0);
        // The following exception was thrown during execution in test generation
        try {
            systemInventory4.manageItemDetails((int) (byte) -1, "hi!", (int) '#', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item with ID -1 does not exist.");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails6);
        org.junit.Assert.assertNull(physicalItemDetails8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory6 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.PhysicalItemDetails physicalItemDetails7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemInventory6.addItem(physicalItemDetails7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory8 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        SystemInventory.SystemInventory systemInventory9 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.SystemInventory.itemList = physicalItemDetailsList1;
        SystemInventory.SystemInventory systemInventory4 = new SystemInventory.SystemInventory((java.util.List<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1);
        systemInventory4.removeItem((int) (short) 0);
        systemInventory4.removeItem((int) (byte) 0);
        SystemInventory.PhysicalItemDetails physicalItemDetails10 = systemInventory4.searchItem(100);
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(physicalItemDetails10);
    }
}

