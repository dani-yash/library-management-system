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
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.Class<?> wildcardClass3 = newsLetter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.close();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.String str3 = newsLetter2.getContent();
        java.lang.Class<?> wildcardClass4 = newsLetter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (byte) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("hi!", "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        int int5 = newsLetter2.getRent();
        java.lang.Class<?> wildcardClass6 = newsLetter2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent((int) (byte) 1);
        newsLetter2.view();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.String str3 = newsLetter2.getContent();
        newsLetter2.close();
        java.lang.String str5 = newsLetter2.getTitle();
        java.lang.Class<?> wildcardClass6 = newsLetter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("hi!", "hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = newsLetter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        newsLetter2.setRent((int) (byte) 10);
        int int5 = newsLetter2.getRent();
        newsLetter2.close();
        java.lang.String str7 = newsLetter2.getTitle();
        java.lang.String str8 = newsLetter2.getContent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        newsLetter2.setRent((int) (byte) 10);
        int int5 = newsLetter2.getRent();
        newsLetter2.close();
        java.lang.Class<?> wildcardClass7 = newsLetter2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        java.lang.String str3 = newsLetter2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent((int) (byte) 1);
        java.lang.String str8 = newsLetter2.getContent();
        java.lang.Class<?> wildcardClass9 = newsLetter2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        newsLetter2.setRent((int) (byte) 10);
        int int5 = newsLetter2.getRent();
        java.lang.Class<?> wildcardClass6 = newsLetter2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.String str3 = newsLetter2.getContent();
        newsLetter2.close();
        java.lang.String str5 = newsLetter2.getTitle();
        java.lang.String str6 = newsLetter2.getContent();
        newsLetter2.setRent((int) (short) 10);
        java.lang.String str9 = newsLetter2.getContent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        newsLetter2.setRent((int) (byte) 10);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent(0);
        java.lang.String str8 = newsLetter2.getContent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.String str3 = newsLetter2.getContent();
        newsLetter2.close();
        java.lang.String str5 = newsLetter2.getTitle();
        java.lang.String str6 = newsLetter2.getContent();
        newsLetter2.view();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.String str3 = newsLetter2.getContent();
        newsLetter2.close();
        java.lang.String str5 = newsLetter2.getTitle();
        java.lang.String str6 = newsLetter2.getContent();
        newsLetter2.close();
        newsLetter2.close();
        java.lang.String str9 = newsLetter2.getContent();
        java.lang.Class<?> wildcardClass10 = newsLetter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        java.lang.String str3 = newsLetter2.getContent();
        newsLetter2.close();
        java.lang.String str5 = newsLetter2.getTitle();
        newsLetter2.view();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        newsLetter2.setRent(10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent((int) (byte) 1);
        newsLetter2.close();
        newsLetter2.view();
        newsLetter2.view();
        java.lang.Class<?> wildcardClass11 = newsLetter2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent((int) (byte) 1);
        newsLetter2.close();
        java.lang.String str9 = newsLetter2.getContent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "hi!");
        newsLetter2.setRent((int) (short) -1);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent((int) (byte) 1);
        newsLetter2.close();
        newsLetter2.setRent((int) (byte) 1);
        newsLetter2.view();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        NewsLetterSystem.NewsLetter newsLetter2 = new NewsLetterSystem.NewsLetter("", "");
        newsLetter2.setRent((int) (byte) 10);
        int int5 = newsLetter2.getRent();
        newsLetter2.setRent(0);
        java.lang.String str8 = newsLetter2.getTitle();
        java.lang.String str9 = newsLetter2.getTitle();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
}

