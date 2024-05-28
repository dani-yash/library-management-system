package PaymentSystem;

import UserData.User;

public class PaymentImpl implements PaymentInterface {

    private User user;
    private float amount;
    private String paymentMethod;

    public PaymentImpl(User user, float amount, String paymentMethod) {
        this.user = user;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean processPayment(User user, float amount, String paymentMethod) {
        if(this.user.equals(user) && this.amount >= amount && this.paymentMethod.equals(paymentMethod)) {
            System.out.println("Payment processed.");
            return true;
        } else {
            System.out.println("Payment failed.");
            return false;
        }
    }

    @Override
    public void storePaymentDetails(User user, Payment payment) {
        System.out.println("Payment details successfully stored.");
    }
}
