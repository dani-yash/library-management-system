package TestCases.ItemsData;

import ItemsData.CD;
import RentingVisitorData.RentingInquiryVisitor;
import RentingVisitorData.RentingVisitor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TestCD {
	private CD cd;
	private RentingInquiryVisitor rentingVisitor;

	@BeforeEach
	void testCDSetUp() {
		cd = new CD(2, 1, "123456789");
		rentingVisitor = new RentingInquiryVisitor();
	}
	
	@Test
	void testGetPrice() {
		assertEquals(2, cd.getPrice());
	}
	
	@Test
	void testSetFirstPrice() {
		cd.setPrice(3);
		assertEquals(3, cd.getPrice());
	}
	
	@Test
	void testSetSecondPrice() {
		cd.setPrice(2);
		assertEquals(2, cd.getPrice());
	}
	
	@Test
	void testGetAmount() {
		assertEquals(1, cd.getAmount());
	}
	
	@Test
	void testSetFirstAmount() {
		cd.setAmount(3);
		assertEquals(3, cd.getAmount());
	}
	
	@Test
	void testSetSecondAmount() {
		cd.setAmount(2);
		assertEquals(2, cd.getAmount());
	}
	
	@Test
	void testGetBarcode() {
		assertEquals("123456789", cd.getBarcode());
	}
	
	@Test
	void testSetFirstBarcode() {
		cd.setBarcode("234567890");
		assertEquals("234567890", cd.getBarcode());
	}
	
	@Test
	void testSetSecondBarcode() {
		cd.setBarcode("345678901");
		assertEquals("345678901", cd.getBarcode());
	}
	
	@Test
	void returnTrueWhenCDAcceptsRentingVisitor() {
		cd.accept(rentingVisitor);
	}

}
