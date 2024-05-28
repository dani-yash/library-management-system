package TestCases.RentingVisitorData;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import RentingVisitorData.RentingInquiryVisitor;
import ItemsData.*;


class TestRentingInquiry {
	private RentingInquiryVisitor visitor;

	@BeforeEach
	void testRentingInquirySetUp() {
		visitor = new RentingInquiryVisitor();

	}
	
	@Test
	void testDefaultCOnstructors() {
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n", visitor.displayRentingInquiry());
	}
	
	
	@Test
	void testVisitBook() {
		Book book = new Book(4, 1, "123456789");
		visitor.visitBook(book);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 1\nBook Barcode: 123456789\nBook Total Price :  4\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n", visitor.displayRentingInquiry());
	}
	
	@Test
	void testVisitCD() {
		CD cd = new CD(3, 1, "234567890");
		visitor.visitCD(cd);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 1\nCD Barcode: 234567890\nCD Total Price :  3\n", visitor.displayRentingInquiry());
	}
	
	@Test
	void testVisitMagzine() {
		Magazine magazine = new Magazine(2, 1, "345678901");
		visitor.visitMagazine(magazine);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 1\nMagzine Barcode: 345678901\nMagzine Total Price :  2\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n", visitor.displayRentingInquiry());
	}
	
	@Test
	void testDisplayRentingInquiryWithEmptyVisitor() {
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n", visitor.displayRentingInquiry());
	}
	
	@Test
	void testVisitBookAndCD() {
		Book book = new Book(4, 1, "123456789");
		CD cd = new CD(3, 1, "234567890");
		visitor.visitBook(book);
		visitor.visitCD(cd);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 1\nBook Barcode: 123456789\nBook Total Price :  4\n\nNumber of Magazines: 0\nMagzine Barcode: \nMagzine Total Price :  0\n\nNumber of CDs: 1\nCD Barcode: 234567890\nCD Total Price :  3\n", visitor.displayRentingInquiry());
	}
	
	@Test
	void testVisitBookAndMagzine() {
		Book book = new Book(4, 1, "123456789");
		Magazine magazine = new Magazine(2, 1, "345678901");
		visitor.visitMagazine(magazine);
		visitor.visitBook(book);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 1\nBook Barcode: 123456789\nBook Total Price :  4\n\nNumber of Magazines: 1\nMagzine Barcode: 345678901\nMagzine Total Price :  2\n\nNumber of CDs: 0\nCD Barcode: \nCD Total Price :  0\n", visitor.displayRentingInquiry());
	}
	
	@Test
	void testVisitMagzineAndCD() {
		Magazine magazine = new Magazine(2, 1, "345678901");
		CD cd = new CD(3, 1, "234567890");
		visitor.visitMagazine(magazine);
		visitor.visitCD(cd);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 0\nBook Barcode: \nBook Total Price :  0\n\nNumber of Magazines: 1\nMagzine Barcode: 345678901\nMagzine Total Price :  2\n\nNumber of CDs: 1\nCD Barcode: 234567890\nCD Total Price :  3\n", visitor.displayRentingInquiry());
	}
	
	@Test 
	void testVisitAll() {
		Book book = new Book(4, 1, "123456789");
		Magazine magazine = new Magazine(2, 1, "345678901");
		CD cd = new CD(3, 1, "234567890");
		visitor.visitBook(book);
		visitor.visitMagazine(magazine);
		visitor.visitCD(cd);
		assertEquals("Renting inquiry for account: \n\nNumber of Books: 1\nBook Barcode: 123456789\nBook Total Price :  4\n\nNumber of Magazines: 1\nMagzine Barcode: 345678901\nMagzine Total Price :  2\n\nNumber of CDs: 1\nCD Barcode: 234567890\nCD Total Price :  3\n", visitor.displayRentingInquiry());
	}

}