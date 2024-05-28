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
        UserData.FacultyMember facultyMember0 = new UserData.FacultyMember();
        ItemsData.Book book1 = facultyMember0.getBook();
        java.lang.String str2 = facultyMember0.getPassword();
        java.lang.String str3 = facultyMember0.getPriorityLevel();
        facultyMember0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = facultyMember0.login("", "hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        UserData.FacultyMember facultyMember0 = new UserData.FacultyMember();
        facultyMember0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = facultyMember0.login("hi!", "");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        UserData.FacultyMember facultyMember0 = new UserData.FacultyMember();
        facultyMember0.setEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = facultyMember0.login("", "hi!");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        UserData.FacultyMember facultyMember0 = new UserData.FacultyMember();
        facultyMember0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = facultyMember0.login("", "");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        UserData.FacultyMember facultyMember0 = new UserData.FacultyMember();
        ItemsData.Book book1 = facultyMember0.getBook();
        java.lang.String str2 = facultyMember0.getPassword();
        java.lang.String str3 = facultyMember0.getPriorityLevel();
        facultyMember0.setUserType("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        facultyMember0.notifyPriority("hi!");
    }
}

