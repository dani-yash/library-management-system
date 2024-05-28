import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        UserData.Student student0 = new UserData.Student();
        ItemsData.Book book1 = student0.getBook();
        java.lang.String str2 = student0.getPassword();
        java.lang.String str3 = student0.getPriorityLevel();
        student0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = student0.login("", "hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        UserData.Student student0 = new UserData.Student();
        student0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = student0.login("hi!", "");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = student0.login("", "hi!");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        UserData.Student student0 = new UserData.Student();
        student0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = student0.login("", "");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        UserData.Student student0 = new UserData.Student();
        ItemsData.Book book1 = student0.getBook();
        java.lang.String str2 = student0.getPassword();
        java.lang.String str3 = student0.getPriorityLevel();
        student0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        student0.notifyPriority("hi!");
    }
}

