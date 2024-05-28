package TestCases.PaymentSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PaymentSystem.Payment;
import PaymentSystem.PaymentImpl;
import UserData.User;

class TestPaymentImpl {

	private PaymentImpl paymentImpl;
	private PaymentImpl newPaymentImpl;
	private User user;
	
	@BeforeEach
	void testPaymentImplSetUp() {
		paymentImpl = new PaymentImpl(user, 20, "credit");
		newPaymentImpl = new PaymentImpl(user, 20, "debit");
		user = new User();
	}
	
	@Test
	void returnTrueIfPaymentProcessed() {
		assertTrue(paymentImpl.processPayment(user, 20, "credit"));
	}
	
	@Test
	void returnTrueIfPaymentAmountIsGreater() {
		assertTrue(paymentImpl.processPayment(user, 25, "credit"));
	}
	
	@Test
	void returnTrueIfPaymentMethodIsDebit() {
		assertTrue(newPaymentImpl.processPayment(user, 20, "debit"));
	}
	
	@Test
	void returnFalseIfPaymentMethodIsSchoolCard() {
		assertFalse(paymentImpl.processPayment(user, 20, "school card"));
	}
	
	@Test
	void returnFalseIfPaymentMethodIsCash() {
		assertFalse(paymentImpl.processPayment(user, 20, "cash"));
	}
	
	@Test
	void returnFalseIfPaymentAmountIsZero() {
		assertFalse(paymentImpl.processPayment(user, 0, "credit"));
	}
	
	@Test
	void returnFalseIfPaymentAmountIsNotEnough() {
		assertFalse(paymentImpl.processPayment(user, 15, "credit"));
	}
	
	@Test
	void returnFalseIfPaymentMethodIsCheque() {
		assertFalse(paymentImpl.processPayment(user, 20, "cheque"));
	}
	
	@Test
	void returnFalseIfPaymentMethodIsETransfer() {
		assertFalse(paymentImpl.processPayment(user, 20, "etransfer"));
	}
	
	@Test
	void testStorePaymentDetails() {
		User newUser = new User("Tim@email.com", "12345");
		PaymentImpl paymentImpl = new PaymentImpl(newUser, 20, "credit");
		Payment payment = new Payment();
		try {
			paymentImpl.storePaymentDetails(newUser, payment);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
	
	

}