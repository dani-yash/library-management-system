package TestCases.PaymentSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PaymentSystem.PaymentProxy;
import PaymentSystem.Payment;
import PaymentSystem.PaymentImpl;
import UserData.User;

class TestPaymentProxy {
	private PaymentProxy paymentProxy;
	private PaymentProxy paymentProxyOne;
	private PaymentProxy paymentProxyTwo;
	private Payment payment;
	private User user;
	
	@BeforeEach
	void testPaymentSetUp() {
		user = new User();
		payment = new Payment();
		PaymentImpl paymentImpl = new PaymentImpl(user, 20, "credit");
		paymentProxy = new PaymentProxy(paymentImpl);
		
	}
	
	@Test
	void testPaymentProcessSuccessful() {
		float amount = 20;
		String paymentMethod = "credit";
		assertTrue(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessSuccessfulWithSufficientFunds() {
		float amount = 25;
		String paymentMethod = "credit";
		assertTrue(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessSuccessfulWithDebit() {
		PaymentImpl newPaymentImpl = new PaymentImpl(user, 20, "debit");
		paymentProxyOne = new PaymentProxy(newPaymentImpl);
		float amount = 20;
		String paymentMethod = "debit";
		assertTrue(paymentProxyOne.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessSuccessfulWithSchoolCard() {
		PaymentImpl newPaymentImpl = new PaymentImpl(user, 20, "school card");
		paymentProxyTwo = new PaymentProxy(newPaymentImpl);
		float amount = 20;
		String paymentMethod = "school card";
		assertTrue(paymentProxyTwo.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessFailedDueToInsufficientFunds() {
		float amount = 15;
		String paymentMethod = "credit";
		assertFalse(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessFailedDueToNoFunds() {
		float amount = 0;
		String paymentMethod = "credit";
		assertFalse(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessFailedDueToCashPaymentMethod() {
		float amount = 20;
		String paymentMethod = "cash";
		assertFalse(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessFailedDueToChequePaymentMethod() {
		float amount = 20;
		String paymentMethod = "cheque";
		assertFalse(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	@Test
	void testPaymentProcessFailedDueToNoPaymentMethod() {
		float amount = 20;
		String paymentMethod = "";
		assertFalse(paymentProxy.processPayment(user, amount, paymentMethod));
	}
	
	
	@Test
	void testStorePaymentDetails() {
		try {
			paymentProxy.storePaymentDetails(user, payment);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
}