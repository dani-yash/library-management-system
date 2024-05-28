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
        boolean boolean2 = UserData.User.register("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        UserData.Student student0 = new UserData.Student();
        ItemsData.Book book1 = student0.getBook();
        java.lang.String str2 = student0.getPassword();
        java.lang.Class<?> wildcardClass3 = student0.getClass();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        UserData.Student student0 = new UserData.Student();
        ItemsData.Book book1 = student0.getBook();
        java.lang.String str2 = student0.getPassword();
        NewsLetterSystem.NewsLetter newsLetter3 = null;
        student0.subscribeNewsletter(newsLetter3);
        PaymentSystem.Payment payment5 = null;
        student0.managePaymentDetails(payment5);
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        UserData.Student student0 = new UserData.Student();
        java.lang.String str1 = student0.getPriorityLevel();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        UserData.Student student0 = new UserData.Student();
        ItemsData.Book book1 = student0.getBook();
        java.lang.String str2 = student0.getPassword();
        java.lang.String str3 = student0.getPriorityLevel();
        student0.setUserType("");
        NewsLetterSystem.NewsLetter newsLetter6 = null;
        student0.subscribeNewsletter(newsLetter6);
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        NewsLetterSystem.NewsLetter newsLetter3 = null;
        student0.subscribeNewsletter(newsLetter3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        UserData.Student student0 = new UserData.Student();
        student0.setUserType("");
        // The following exception was thrown during execution in test generation
        try {
            student0.viewOverdueItems();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        boolean boolean2 = UserData.User.register("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        UserData.Student student0 = new UserData.Student();
        ItemsData.Book book1 = student0.getBook();
        java.lang.String str2 = student0.getPassword();
        java.lang.String str3 = student0.getPriorityLevel();
        student0.setUserType("");
        java.lang.String str6 = student0.getPriorityLevel();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        NewsLetterSystem.NewsLetter newsLetter3 = null;
        student0.viewNewsletter(newsLetter3);
        NewsLetterSystem.NewsLetter newsLetter5 = null;
        student0.viewNewsletter(newsLetter5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList3 = student0.viewSubscribedNewsletters();
        java.lang.String str4 = student0.getEmail();
        org.junit.Assert.assertNotNull(newsLetterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        boolean boolean2 = UserData.User.register("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        boolean boolean2 = UserData.User.register("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        NewsLetterSystem.NewsLetter newsLetter3 = null;
        student0.viewNewsletter(newsLetter3);
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList5 = student0.viewSubscribedNewsletters();
        org.junit.Assert.assertNotNull(newsLetterList5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        UserData.Student student0 = new UserData.Student();
        student0.requestNewBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            student0.viewOverdueItems();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        UserData.Student student0 = new UserData.Student();
        student0.setUserType("");
        NewsLetterSystem.NewsLetter newsLetter3 = null;
        student0.closeNewsletter(newsLetter3);
        student0.setEmail("hi!");
        java.lang.Class<?> wildcardClass7 = student0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        UserData.Student student0 = new UserData.Student();
        student0.requestNewBook("hi!");
        student0.viewDueDates();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList3 = student0.viewSubscribedNewsletters();
        student0.setPassword("");
        org.junit.Assert.assertNotNull(newsLetterList3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        UserData.Student student0 = new UserData.Student();
        student0.requestNewBook("hi!");
        java.lang.String str3 = student0.getId();
        student0.setEmail("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        boolean boolean5 = student0.makePayment((float) 'a', "");
        java.lang.String str6 = student0.getPassword();
        UserData.Student student7 = new UserData.Student();
        student7.setId("hi!");
        student7.requestNewBook("");
        ItemsData.Book book12 = null;
        student0.Request((UserData.User) student7, book12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList3 = student0.viewSubscribedNewsletters();
        java.lang.Class<?> wildcardClass4 = newsLetterList3.getClass();
        org.junit.Assert.assertNotNull(newsLetterList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        UserData.Student student0 = new UserData.Student();
        student0.setEmail("");
        boolean boolean5 = student0.makePayment((float) 'a', "");
        student0.requestNewBook("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        UserData.Student student0 = new UserData.Student();
        java.lang.String str1 = student0.getId();
        student0.viewBorrowedItems();
        UserData.Student student3 = new UserData.Student();
        student3.setEmail("");
        NewsLetterSystem.NewsLetter newsLetter6 = null;
        student3.closeNewsletter(newsLetter6);
        ItemsData.PhysicalItem physicalItem8 = null;
        boolean boolean9 = student3.rentItem(physicalItem8);
        ItemsData.Book book10 = null;
        student0.Request((UserData.User) student3, book10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

