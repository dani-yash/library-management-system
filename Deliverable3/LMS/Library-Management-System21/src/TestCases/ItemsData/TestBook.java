package TestCases.ItemsData;

import ItemsData.Book;
import RentingVisitorData.RentingInquiryVisitor;
import RentingVisitorData.RentingVisitor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



class TestBook {
	private Book book;
	private RentingInquiryVisitor rentingVisitor;
	
	@BeforeEach
	void testBookSetUp() {
		book = new Book(2, 1, "123456789");
		rentingVisitor = new RentingInquiryVisitor();
	}
	
	@Test
	void testGetTitle() {
		book.setTitle("Title");
		String title = "Title";
		assertEquals(title, book.getTitle());
	}
	
	@Test
	void testSetTitle() {
		book.setTitle("Book");
		assertEquals("Book", book.getTitle());
	}
	
	@Test
	void testGetAuthor() {
		book.setAuthor("Bob");
		String author = "Bob";
		assertEquals(author, book.getAuthor());
	}
	
	@Test
	void testSetAuthor() {
		book.setAuthor("Tom");
		assertEquals("Tom", book.getAuthor());
	}
	
	@Test 
	void testGetGenre() {
		book.setGenre("fiction");
		String genre = "fiction";
		assertEquals(genre, book.getGenre());
	}
	
	@Test
	void testSetGenre() {
		book.setGenre("nonfiction");
		assertEquals("nonfiction", book.getGenre());
	}
	
	@Test
	void testGetPrice() {
		assertEquals(2, book.getPrice());
	}
	
	@Test
	void testSetPrice() {
		book.setPrice(3);
		assertEquals(3, book.getPrice());
	}
	
	@Test
	void testGetAmount() {
		assertEquals(1, book.getAmount());
	}
	
	@Test
	void testSetAmount() {
		book.setAmount(2);
		assertEquals(2, book.getAmount());
	}
	
	@Test
	void testGetBarcode() {
		assertEquals("123456789", book.getBarcode());
	}
	
	@Test
	void testSetBarcode() {
		book.setBarcode("234567890");
		assertEquals("234567890", book.getBarcode());
	}
	
	@Test
	void returnTrueWhenBookAcceptsRentingVisitor() {
		book.accept(rentingVisitor);
	}

}
