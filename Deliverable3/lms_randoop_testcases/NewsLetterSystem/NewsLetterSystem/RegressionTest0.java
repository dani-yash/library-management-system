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
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        NewsLetterSystem.NewsLetter newsLetter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user1, newsLetter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        NewsLetterSystem.NewsLetter newsLetter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user1, newsLetter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        NewsLetterSystem.NewsLetter newsLetter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user1, newsLetter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        NewsLetterSystem.NewsLetter newsLetter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user3, newsLetter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        NewsLetterSystem.NewsLetter newsLetter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user3, newsLetter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        NewsLetterSystem.NewsLetter newsLetter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user5, newsLetter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        NewsLetterSystem.NewsLetter newsLetter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user5, newsLetter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        NewsLetterSystem.NewsLetter newsLetter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user9, newsLetter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        NewsLetterSystem.NewsLetter newsLetter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user3, newsLetter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        java.lang.Class<?> wildcardClass3 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        NewsLetterSystem.NewsLetter newsLetter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user7, newsLetter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        java.lang.Class<?> wildcardClass3 = newsLetterList2.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        NewsLetterSystem.NewsLetter newsLetter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user9, newsLetter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        NewsLetterSystem.NewsLetter newsLetter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user11, newsLetter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        java.lang.Class<?> wildcardClass5 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        NewsLetterSystem.NewsLetter newsLetter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user5, newsLetter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        java.lang.Class<?> wildcardClass11 = newsLetterList10.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        NewsLetterSystem.NewsLetter newsLetter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user11, newsLetter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        java.lang.Class<?> wildcardClass7 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        NewsLetterSystem.NewsLetter newsLetter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user11, newsLetter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        NewsLetterSystem.NewsLetter newsLetter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user9, newsLetter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        NewsLetterSystem.NewsLetter newsLetter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user13, newsLetter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        NewsLetterSystem.NewsLetter newsLetter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user7, newsLetter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        java.lang.Class<?> wildcardClass13 = newsLetterList12.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        java.lang.Class<?> wildcardClass9 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        java.lang.Class<?> wildcardClass1 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        NewsLetterSystem.NewsLetter newsLetter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user13, newsLetter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        NewsLetterSystem.NewsLetter newsLetter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user7, newsLetter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        NewsLetterSystem.NewsLetter newsLetter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.viewNewsLetter(user15, newsLetter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        NewsLetterSystem.NewsLetter newsLetter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user15, newsLetter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        java.lang.Class<?> wildcardClass5 = newsLetterList4.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        NewsLetterSystem.NewsLetter newsLetter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user13, newsLetter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        java.lang.Class<?> wildcardClass7 = newsLetterList6.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        NewsLetterSystem.NewsLetter newsLetter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.cancelSubscription(user15, newsLetter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        java.lang.Class<?> wildcardClass15 = newsLetterList14.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList16 = newsLetterSystem0.viewSubscriptions(user15);
        java.lang.Class<?> wildcardClass17 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
        org.junit.Assert.assertNotNull(newsLetterList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        java.lang.Class<?> wildcardClass13 = newsLetterSystem0.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList16 = newsLetterSystem0.viewSubscriptions(user15);
        UserData.User user17 = null;
        NewsLetterSystem.NewsLetter newsLetter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetterSystem0.subscribe(user17, newsLetter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
        org.junit.Assert.assertNotNull(newsLetterList16);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList16 = newsLetterSystem0.viewSubscriptions(user15);
        UserData.User user17 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList18 = newsLetterSystem0.viewSubscriptions(user17);
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
        org.junit.Assert.assertNotNull(newsLetterList16);
        org.junit.Assert.assertNotNull(newsLetterList18);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        NewsLetterSystem.NewsLetterSystem newsLetterSystem0 = new NewsLetterSystem.NewsLetterSystem();
        UserData.User user1 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList2 = newsLetterSystem0.viewSubscriptions(user1);
        UserData.User user3 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList4 = newsLetterSystem0.viewSubscriptions(user3);
        UserData.User user5 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList6 = newsLetterSystem0.viewSubscriptions(user5);
        UserData.User user7 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList8 = newsLetterSystem0.viewSubscriptions(user7);
        UserData.User user9 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList10 = newsLetterSystem0.viewSubscriptions(user9);
        UserData.User user11 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList12 = newsLetterSystem0.viewSubscriptions(user11);
        UserData.User user13 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList14 = newsLetterSystem0.viewSubscriptions(user13);
        UserData.User user15 = null;
        java.util.List<NewsLetterSystem.NewsLetter> newsLetterList16 = newsLetterSystem0.viewSubscriptions(user15);
        java.lang.Class<?> wildcardClass17 = newsLetterList16.getClass();
        org.junit.Assert.assertNotNull(newsLetterList2);
        org.junit.Assert.assertNotNull(newsLetterList4);
        org.junit.Assert.assertNotNull(newsLetterList6);
        org.junit.Assert.assertNotNull(newsLetterList8);
        org.junit.Assert.assertNotNull(newsLetterList10);
        org.junit.Assert.assertNotNull(newsLetterList12);
        org.junit.Assert.assertNotNull(newsLetterList14);
        org.junit.Assert.assertNotNull(newsLetterList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

