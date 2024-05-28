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
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem0.path = "";
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        java.lang.Class<?> wildcardClass2 = libraryManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem0.prioritizeRequests();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        javax.swing.JTextArea jTextArea3 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem4 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem4.prioritizeRequests();
        javax.swing.JTextArea jTextArea6 = libraryManagementSystem4.resultArea;
        java.util.ArrayList<ItemsData.Book> bookList7 = libraryManagementSystem4.books;
        libraryManagementSystem0.displayResults((java.util.List<ItemsData.Book>) bookList7);
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(jTextArea3);
        org.junit.Assert.assertNotNull(jTextArea6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        ItemsData.Book[] bookArray4 = new ItemsData.Book[] {};
        java.util.ArrayList<ItemsData.Book> bookList5 = new java.util.ArrayList<ItemsData.Book>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ItemsData.Book>) bookList5, bookArray4);
        libraryManagementSystem0.books = bookList5;
        UserData.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementSystem0.notifyUserPriority(user8, "src/csv/books.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem2 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem2.prioritizeRequests();
        javax.swing.JTextArea jTextArea4 = libraryManagementSystem2.resultArea;
        libraryManagementSystem0.resultArea = jTextArea4;
        UserData.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementSystem0.notifyUserPriority(user6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(jTextArea4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem0.prioritizeRequests();
        java.lang.Class<?> wildcardClass2 = libraryManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList1 = libraryManagementSystem0.books;
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        java.lang.Class<?> wildcardClass3 = libraryManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        java.lang.Class<?> wildcardClass4 = libraryManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        ItemsData.Book book2 = null;
        ItemsData.Book book3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = libraryManagementSystem0.isSimilar(book2, book3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTextArea1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        java.lang.Class<?> wildcardClass2 = jTextArea1.getClass();
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        java.lang.String str2 = libraryManagementSystem0.path;
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/csv/books.csv" + "'", str2, "src/csv/books.csv");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem0.prioritizeRequests();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        javax.swing.JTextArea jTextArea3 = libraryManagementSystem0.resultArea;
        libraryManagementSystem0.path = "hi!";
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(jTextArea3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList1 = libraryManagementSystem0.books;
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem3 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem4 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea5 = libraryManagementSystem4.resultArea;
        libraryManagementSystem3.resultArea = jTextArea5;
        SystemInventory.LibraryManagementSystem libraryManagementSystem7 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList8 = libraryManagementSystem7.books;
        libraryManagementSystem3.books = bookList8;
        libraryManagementSystem0.displayResults((java.util.List<ItemsData.Book>) bookList8);
        ItemsData.Book book11 = null;
        ItemsData.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = libraryManagementSystem0.isSimilar(book11, book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(jTextArea5);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList1 = libraryManagementSystem0.books;
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem3 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem4 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea5 = libraryManagementSystem4.resultArea;
        libraryManagementSystem3.resultArea = jTextArea5;
        SystemInventory.LibraryManagementSystem libraryManagementSystem7 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList8 = libraryManagementSystem7.books;
        libraryManagementSystem3.books = bookList8;
        libraryManagementSystem0.displayResults((java.util.List<ItemsData.Book>) bookList8);
        libraryManagementSystem0.prioritizeRequests();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(jTextArea5);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        ItemsData.Book[] bookArray4 = new ItemsData.Book[] {};
        java.util.ArrayList<ItemsData.Book> bookList5 = new java.util.ArrayList<ItemsData.Book>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ItemsData.Book>) bookList5, bookArray4);
        libraryManagementSystem0.books = bookList5;
        javax.swing.JTextArea jTextArea8 = libraryManagementSystem0.resultArea;
        java.lang.String str9 = libraryManagementSystem0.path;
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jTextArea8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/csv/books.csv" + "'", str9, "src/csv/books.csv");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem2 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem2.prioritizeRequests();
        javax.swing.JTextArea jTextArea4 = libraryManagementSystem2.resultArea;
        libraryManagementSystem0.resultArea = jTextArea4;
        java.lang.Class<?> wildcardClass6 = jTextArea4.getClass();
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(jTextArea4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList1 = libraryManagementSystem0.books;
        UserData.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementSystem0.notifyUserPriority(user2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem0.prioritizeRequests();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        libraryManagementSystem0.prioritizeRequests();
        org.junit.Assert.assertNotNull(jTextArea2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        SystemInventory.LibraryManagementSystem libraryManagementSystem4 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList5 = libraryManagementSystem4.books;
        libraryManagementSystem0.books = bookList5;
        java.util.ArrayList<ItemsData.Book> bookList7 = libraryManagementSystem0.books;
        java.lang.Class<?> wildcardClass8 = bookList7.getClass();
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        SystemInventory.LibraryManagementSystem libraryManagementSystem4 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList5 = libraryManagementSystem4.books;
        libraryManagementSystem0.books = bookList5;
        java.util.ArrayList<ItemsData.Book> bookList7 = libraryManagementSystem0.books;
        javax.swing.JTextArea jTextArea8 = libraryManagementSystem0.resultArea;
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(jTextArea8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        ItemsData.Book[] bookArray4 = new ItemsData.Book[] {};
        java.util.ArrayList<ItemsData.Book> bookList5 = new java.util.ArrayList<ItemsData.Book>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ItemsData.Book>) bookList5, bookArray4);
        libraryManagementSystem0.books = bookList5;
        SystemInventory.LibraryManagementSystem libraryManagementSystem8 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem8.prioritizeRequests();
        java.util.ArrayList<ItemsData.Book> bookList10 = libraryManagementSystem8.books;
        java.util.ArrayList<ItemsData.Book> bookList11 = libraryManagementSystem8.books;
        libraryManagementSystem0.books = bookList11;
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        SystemInventory.LibraryManagementSystem libraryManagementSystem4 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem5 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea6 = libraryManagementSystem5.resultArea;
        libraryManagementSystem4.resultArea = jTextArea6;
        SystemInventory.LibraryManagementSystem libraryManagementSystem8 = new SystemInventory.LibraryManagementSystem();
        java.util.ArrayList<ItemsData.Book> bookList9 = libraryManagementSystem8.books;
        libraryManagementSystem4.books = bookList9;
        libraryManagementSystem0.displayResults((java.util.List<ItemsData.Book>) bookList9);
        javax.swing.JTextArea jTextArea12 = libraryManagementSystem0.resultArea;
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(jTextArea6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(jTextArea12);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem3 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea4 = libraryManagementSystem3.resultArea;
        libraryManagementSystem0.resultArea = jTextArea4;
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(jTextArea4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem2 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem2.prioritizeRequests();
        javax.swing.JTextArea jTextArea4 = libraryManagementSystem2.resultArea;
        libraryManagementSystem0.resultArea = jTextArea4;
        SystemInventory.LibraryManagementSystem libraryManagementSystem6 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem6.prioritizeRequests();
        javax.swing.JTextArea jTextArea8 = libraryManagementSystem6.resultArea;
        java.util.ArrayList<ItemsData.Book> bookList9 = libraryManagementSystem6.books;
        libraryManagementSystem0.books = bookList9;
        java.util.ArrayList<ItemsData.Book> bookList11 = null;
        libraryManagementSystem0.books = bookList11;
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(jTextArea4);
        org.junit.Assert.assertNotNull(jTextArea8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        ItemsData.Book[] bookArray4 = new ItemsData.Book[] {};
        java.util.ArrayList<ItemsData.Book> bookList5 = new java.util.ArrayList<ItemsData.Book>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<ItemsData.Book>) bookList5, bookArray4);
        libraryManagementSystem0.books = bookList5;
        SystemInventory.LibraryManagementSystem libraryManagementSystem8 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea9 = libraryManagementSystem8.resultArea;
        libraryManagementSystem0.resultArea = jTextArea9;
        java.lang.String str11 = libraryManagementSystem0.path;
        UserData.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagementSystem0.notifyUserPriority(user12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTextArea2);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jTextArea9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "src/csv/books.csv" + "'", str11, "src/csv/books.csv");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea1 = libraryManagementSystem0.resultArea;
        SystemInventory.LibraryManagementSystem libraryManagementSystem2 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem2.prioritizeRequests();
        javax.swing.JTextArea jTextArea4 = libraryManagementSystem2.resultArea;
        libraryManagementSystem0.resultArea = jTextArea4;
        SystemInventory.LibraryManagementSystem libraryManagementSystem6 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem6.prioritizeRequests();
        javax.swing.JTextArea jTextArea8 = libraryManagementSystem6.resultArea;
        java.util.ArrayList<ItemsData.Book> bookList9 = libraryManagementSystem6.books;
        libraryManagementSystem0.books = bookList9;
        java.util.ArrayList<ItemsData.Book> bookList11 = libraryManagementSystem0.books;
        org.junit.Assert.assertNotNull(jTextArea1);
        org.junit.Assert.assertNotNull(jTextArea4);
        org.junit.Assert.assertNotNull(jTextArea8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        libraryManagementSystem0.prioritizeRequests();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem0.resultArea;
        ItemsData.Book book3 = null;
        ItemsData.Book book4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = libraryManagementSystem0.isSimilar(book3, book4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTextArea2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        SystemInventory.LibraryManagementSystem libraryManagementSystem0 = new SystemInventory.LibraryManagementSystem();
        SystemInventory.LibraryManagementSystem libraryManagementSystem1 = new SystemInventory.LibraryManagementSystem();
        javax.swing.JTextArea jTextArea2 = libraryManagementSystem1.resultArea;
        libraryManagementSystem0.resultArea = jTextArea2;
        libraryManagementSystem0.prioritizeRequests();
        org.junit.Assert.assertNotNull(jTextArea2);
    }
}

