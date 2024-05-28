package TestCases.ItemsData;

import ItemsData.Magazine;
import RentingVisitorData.RentingInquiryVisitor;
import RentingVisitorData.RentingVisitor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class TestMagazine {

	private Magazine magazine;
	private RentingInquiryVisitor rentingVisitor;

	@BeforeEach
	void testMagazineSetUp() {
		magazine = new Magazine(2, 1, "123456789");
		rentingVisitor = new RentingInquiryVisitor();
	}
	
	@Test
	void testGetPrice() {
		assertEquals(2, magazine.getPrice());
	}
	
	@Test
	void testSetFirstPrice() {
		magazine.setPrice(3);
		assertEquals(3, magazine.getPrice());
	}
	
	@Test
	void testSetSecondPrice() {
		magazine.setPrice(2);
		assertEquals(2, magazine.getPrice());
	}
	
	@Test
	void testGetAmount() {
		assertEquals(1, magazine.getAmount());
	}
	
	@Test
	void testSetFirstAmount() {
		magazine.setAmount(1);
		assertEquals(1, magazine.getAmount());
	}
	
	@Test
	void testSetSecondAmount() {
		magazine.setAmount(2);
		assertEquals(2, magazine.getAmount());
	}
	
	@Test
	void testGetBarcode() {
		assertEquals("123456789", magazine.getBarcode());
	}
	
	@Test
	void testSeFirstBarcode() {
		magazine.setBarcode("234567890");
		assertEquals("234567890", magazine.getBarcode());
	}
	
	@Test
	void testSetSecondBarcode() {
		magazine.setBarcode("345678901");
		assertEquals("345678901", magazine.getBarcode());
	}
	
	@Test
	void returnTrueWhenMagazineAcceptsRentingVisitor() {
		magazine.accept(rentingVisitor);
	}

}
