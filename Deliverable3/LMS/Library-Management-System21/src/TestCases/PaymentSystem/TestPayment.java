package TestCases.PaymentSystem;

import PaymentSystem.Payment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TestPayment {

	private Payment payment;
	
	@BeforeEach
	void testPaymentSetUp() {
		payment = new Payment();
	}
	
	@Test
	void testGetPaymentID() {
		payment.setPaymentID("12345");
		assertEquals("12345", payment.getPaymentID());
	}
	
	@Test
	void testGetAmount() {
		payment.setAmount(15);
		assertEquals(15, payment.getAmount());
	}
	
	@Test 
	void testGetPaymentMethod() {
		payment.setPaymentMethod("credit");
		assertEquals("credit", payment.getPaymentMethod());
	}
	
	@Test 
	void testSetPaymentID() {
		payment.setPaymentID("23456");
		assertEquals("23456", payment.getPaymentID());
	}
	
	@Test 
	void testSetNewPaymentID() {
		payment.setPaymentID("56789");
		assertEquals("56789", payment.getPaymentID());
	}
	
	@Test 
	void testSetAnotherNewPaymentID() {
		payment.setPaymentID("34567");
		assertEquals("34567", payment.getPaymentID());
	}
	
	@Test
	void testSetAmount() {
		payment.setAmount(20);
		assertEquals(20, payment.getAmount());
	}
	
	@Test
	void testSetNewAmount() {
		payment.setAmount(30);
		assertEquals(30, payment.getAmount());
	}
	
	@Test
	void testSetAnotherNewAmount() {
		payment.setAmount(10);
		assertEquals(10, payment.getAmount());
	}
	
	@Test
	void testSetPaymentMethod() {
		payment.setPaymentMethod("debit");
		assertEquals("debit", payment.getPaymentMethod());
	}
	
	@Test
	void testSetNewPaymentMethod() {
		payment.setPaymentMethod("school card");
		assertEquals("school card", payment.getPaymentMethod());
	}
	
	@Test
	void testSetAnotherNewPaymentMethod() {
		payment.setPaymentMethod("credit");
		assertEquals("credit", payment.getPaymentMethod());
	}

}
