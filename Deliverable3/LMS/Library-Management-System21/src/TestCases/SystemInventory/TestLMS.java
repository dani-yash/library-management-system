package TestCases.SystemInventory;

import ItemsData.Book;
import SystemInventory.LibraryManagementSystem;
import UserData.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestLMS {
    @Test
    void testLoad() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.load("D:\\\\Downloads\\\\Documents\\\\maven\\\\LMSN2\\\\Library-Management-System21\\\\src\\\\csv\\\\books.csv");
        assertFalse(lms.books.isEmpty());
    }

    @Test
    void testBookNotEmpty() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.load("D:\\\\Downloads\\\\Documents\\\\maven\\\\LMSN2\\\\Library-Management-System21\\\\src\\\\csv\\\\books.csv");
        Book inputBook = new Book(0, 0, "#");
        inputBook.setTitle("Test Title");
        inputBook.setAuthor("Test Author");
        inputBook.setGenre("Test Genre");
        assertFalse(inputBook.getTitle().isEmpty());
        assertFalse(inputBook.getAuthor().isEmpty());
        assertFalse(inputBook.getGenre().isEmpty());
    }

    @Test
    void testIsSimilar() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Book book1 = new Book(0, 0, "#");
        book1.setTitle("Test Title");
        book1.setAuthor("Test Author");
        book1.setGenre("Test Genre");
        Book book2 = new Book(0, 0, "#");
        book2.setTitle("Test Title");
        book2.setAuthor("Test Author");
        book2.setGenre("Test Genre");
        assertTrue(lms.isSimilar(book1, book2));
    }

    @Test
    void testLoadWithInvalidPath() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        assertThrows(Exception.class, () -> lms.load("invalid/path.csv"));
    }

    @Test
    void testSearchSimilarBooksWithNonExistentBook() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.load("D:\\\\Downloads\\\\Documents\\\\maven\\\\LMSN2\\\\Library-Management-System21\\\\src\\\\csv\\\\books.csv");
        Book inputBook = new Book(0, 0, "#");
        inputBook.setTitle("Non Existent Title");
        inputBook.setAuthor("Non Existent Author");
        inputBook.setGenre("Non Existent Genre");
        List<Book> similarBooks = lms.searchSimilarBooks(inputBook);
        assertTrue(similarBooks.isEmpty());
    }

    @Test
    void testIsSimilarWithNonSimilarBooks() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Book book1 = new Book(0, 0, "#");
        book1.setTitle("Test Title");
        book1.setAuthor("Test Author");
        book1.setGenre("Test Genre");
        Book book2 = new Book(0, 0, "#");
        book2.setTitle("Different Title");
        book2.setAuthor("Different Author");
        book2.setGenre("Different Genre");
        assertFalse(lms.isSimilar(book1, book2));
    }

    @Test
    void testLoadWithEmptyFile() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        assertThrows(Exception.class, () -> lms.load("src/csv/empty.csv"));
    }

    @Test
    void testBookNotNull() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.load("D:\\\\Downloads\\\\Documents\\\\maven\\\\LMSN2\\\\Library-Management-System21\\\\src\\\\csv\\\\books.csv");
        Book inputBook = new Book(0, 0, "#");
        inputBook.setTitle("Existing Title");
        inputBook.setAuthor("Existing Author");
        inputBook.setGenre("Existing Genre");
        assertNotNull(inputBook);
    }

    @Test
    void testIsSimilarWithSimilarBooks() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Book book1 = new Book(0, 0, "#");
        book1.setTitle("Same Title");
        book1.setAuthor("Same Author");
        book1.setGenre("Same Genre");
        Book book2 = new Book(0, 0, "#");
        book2.setTitle("Same Title");
        book2.setAuthor("Same Author");
        book2.setGenre("Same Genre");
        assertTrue(lms.isSimilar(book1, book2));
    }

    @Test
    void testDisplayResultsWithListOfBooks() throws Exception {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(0, 0, "#");
        book1.setTitle("Test Title 1");
        book1.setAuthor("Test Author 1");
        book1.setGenre("Test Genre 1");
        books.add(book1);
        Book book2 = new Book(0, 0, "#");
        book2.setTitle("Test Title 2");
        book2.setAuthor("Test Author 2");
        book2.setGenre("Test Genre 2");
        books.add(book2);
        lms.displayResults(books);
        String expected = "Test Title 1 by Test Author 1\nTest Title 2 by Test Author 2\n";
        assertEquals(expected, lms.resultArea.getText());
    }

    @Test
    void testNotifyUserPriorityWithUserAndPriority() throws Exception {
        User user = new User("test@test.com", "password");
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.notifyUserPriority(user, "High");
    }
}
