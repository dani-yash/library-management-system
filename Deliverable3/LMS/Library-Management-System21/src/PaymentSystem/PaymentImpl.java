package PaymentSystem;

import UserData.User;

public class PaymentImpl implements PaymentInterface {

    private float amount;
    private String paymentMethod;

    public PaymentImpl(User user, float amount, String paymentMethod) {
        user = new User();
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean processPayment(User user, float amount, String paymentMethod) {
        if(user.equals(user) && amount >= this.amount && paymentMethod.equals(this.paymentMethod)) {
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