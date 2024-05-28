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
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        physicalItemDetails4.setDueDate("D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        int int5 = physicalItemDetails4.getItemID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.path;
        physicalItemDetails4.markAsLost();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str5, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) (byte) -1, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv", 100, "");
        physicalItemDetails4.setBorrowAbility(false);
        physicalItemDetails4.setItemName("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.checkAvailability();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = physicalItemDetails4.calculatePenalty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) (byte) -1, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv", 100, "");
        physicalItemDetails4.setBorrowAbility(false);
        java.lang.String str7 = physicalItemDetails4.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str7, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) (byte) -1, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv", 100, "");
        physicalItemDetails4.setBorrowAbility(false);
        physicalItemDetails4.setLocation("D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        java.lang.String str7 = physicalItemDetails4.path;
        boolean boolean8 = physicalItemDetails4.checkAvailability();
        physicalItemDetails4.setLocation("");
        java.lang.String str11 = physicalItemDetails4.getLocation();
        physicalItemDetails4.setLocation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str7, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.returnItem();
        int int8 = physicalItemDetails4.getItemID();
        physicalItemDetails4.setBorrowAbility(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.path;
        java.lang.String str6 = physicalItemDetails4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str5, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.path;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = physicalItemDetails4.isOverdue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str5, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        java.lang.String str7 = physicalItemDetails4.path;
        boolean boolean8 = physicalItemDetails4.checkAvailability();
        physicalItemDetails4.setLocation("");
        java.lang.String str11 = physicalItemDetails4.getLocation();
        physicalItemDetails4.setItemID(10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str7, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.getItemName();
        boolean boolean6 = physicalItemDetails4.checkAvailability();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        java.lang.String str7 = physicalItemDetails4.path;
        physicalItemDetails4.setItemName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = physicalItemDetails4.isOverdue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str7, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        java.lang.String str7 = physicalItemDetails4.path;
        physicalItemDetails4.setItemName("hi!");
        physicalItemDetails4.path = "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str7, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = SystemInventory.PhysicalItemDetails.items;
        org.junit.Assert.assertNotNull(physicalItemDetailsList0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        physicalItemDetails4.setAvailableCopies((int) '4');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.getItemName();
        java.lang.String str6 = physicalItemDetails4.getItemName();
        boolean boolean7 = physicalItemDetails4.returnItem();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.returnItem();
        int int8 = physicalItemDetails4.getItemID();
        physicalItemDetails4.setItemID((int) (short) 0);
        physicalItemDetails4.setItemName("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.path;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = physicalItemDetails4.calculatePenalty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv" + "'", str5, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.checkAvailability();
        boolean boolean8 = physicalItemDetails4.borrowItem();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.checkAvailability();
        java.lang.String str8 = physicalItemDetails4.getDueDate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.returnItem();
        physicalItemDetails4.setItemID(10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        boolean boolean7 = physicalItemDetails4.returnItem();
        int int8 = physicalItemDetails4.getItemID();
        java.lang.String str9 = physicalItemDetails4.getDueDate();
        physicalItemDetails4.markAsLost();
        java.lang.String str11 = physicalItemDetails4.getLocation();
        int int12 = physicalItemDetails4.getItemID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails(100, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv", (int) '4', "hi!");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) (byte) -1, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv", 100, "");
        physicalItemDetails4.setItemName("D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
        boolean boolean7 = physicalItemDetails4.borrowItem();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        java.lang.String str5 = physicalItemDetails4.getItemName();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = physicalItemDetails4.calculatePenalty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) (byte) -1, "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv", 100, "");
        physicalItemDetails4.setItemName("D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv");
        boolean boolean7 = physicalItemDetails4.returnItem();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = physicalItemDetails4.calculatePenalty();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        SystemInventory.PhysicalItemDetails physicalItemDetails4 = new SystemInventory.PhysicalItemDetails((int) '4', "hi!", 0, "");
        physicalItemDetails4.setItemName("");
        physicalItemDetails4.setItemName("hi!");
    }
}

