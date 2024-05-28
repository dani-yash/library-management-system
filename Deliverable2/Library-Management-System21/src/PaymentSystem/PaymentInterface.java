package PaymentSystem;

import UserData.User;

public interface PaymentInterface {
    boolean processPayment(User user, float amount, String paymentMethod);
    void storePaymentDetails(User user, Payment payment);
}
