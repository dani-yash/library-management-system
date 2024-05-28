import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemLocation((int) (short) -1, "hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.disableItem((int) (short) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.disableItem((int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.enableItem((int) ' ');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemId((int) (byte) -1, (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemId(100, 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.disableItem((int) (byte) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemId((-1), (int) (byte) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.disableItem((int) (byte) -1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.enableItem(0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.removeItem((int) ' ');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemId((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemId(0, (int) ' ');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.removeItem(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemLocation((int) (short) 100, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.enableItem(1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.enableItem((int) (short) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.removeItem((int) (short) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        boolean boolean8 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.enableItem((int) (byte) 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.removeItem((int) (byte) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.removeItem((int) '#');
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemLocation(10, "hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.changeItemId((int) 'a', (int) (short) 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        boolean boolean8 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.disableItem((int) (short) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        SystemInventory.LibraryManagementTeam libraryManagementTeam0 = new SystemInventory.LibraryManagementTeam();
        boolean boolean4 = libraryManagementTeam0.verifyRegisteredUser("", "", "hi!");
        boolean boolean8 = libraryManagementTeam0.verifyRegisteredUser("hi!", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        libraryManagementTeam0.disableItem((int) (byte) 10);
    }
}

