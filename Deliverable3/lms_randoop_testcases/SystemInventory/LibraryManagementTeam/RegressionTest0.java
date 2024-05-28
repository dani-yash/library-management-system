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
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = SystemInventory.LibraryManagementTeam.items;
        java.lang.Class<?> wildcardClass1 = physicalItemDetailsList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList1;
        java.lang.Class<?> wildcardClass4 = physicalItemDetailsList1.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        SystemInventory.LibraryManagementTeam.resetItems();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        java.lang.Class<?> wildcardClass1 = libraryManagementTeam0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "hi!");
        SystemInventory.PhysicalItemDetails physicalItemDetails5 = null;
        libraryManagementTeam0.addItem(physicalItemDetails5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        SystemInventory.PhysicalItemDetails physicalItemDetails5 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementTeam0.addItem(physicalItemDetails5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = SystemInventory.LibraryManagementTeam.items;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList0;
        java.lang.Class<?> wildcardClass2 = physicalItemDetailsList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        boolean boolean8 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementTeam0.changeItemId((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Item not found");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        SystemInventory.PhysicalItemDetails physicalItemDetails1 = null;
// flaky:         libraryManagementTeam0.addItem(physicalItemDetails1);
        SystemInventory.PhysicalItemDetails physicalItemDetails3 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementTeam0.addItem(physicalItemDetails3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = SystemInventory.LibraryManagementTeam.items;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList0;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList0;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList0;
        java.lang.Class<?> wildcardClass4 = physicalItemDetailsList0.getClass();
        org.junit.Assert.assertNotNull(physicalItemDetailsList0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        boolean boolean8 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "hi!");
        boolean boolean8 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        SystemInventory.PhysicalItemDetails[] physicalItemDetailsArray0 = new SystemInventory.PhysicalItemDetails[] {};
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList1 = new java.util.ArrayList<SystemInventory.PhysicalItemDetails>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<SystemInventory.PhysicalItemDetails>) physicalItemDetailsList1, physicalItemDetailsArray0);
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList1;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList1;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList1;
        SystemInventory.LibraryManagementTeam.items = physicalItemDetailsList1;
        org.junit.Assert.assertNotNull(physicalItemDetailsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}
