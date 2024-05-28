package PaymentSystem;

import UserData.User;

public class PaymentProxy implements PaymentInterface {
    private static PaymentInterface paymentInterface;

    public PaymentProxy(PaymentInterface paymentInterface) {
        PaymentProxy.paymentInterface = paymentInterface;
    }

    @Override
    public boolean processPayment(User user, float amount, String paymentMethod) {
        return paymentInterface.processPayment(user, amount, paymentMethod);
    }

    @Override
    public void storePaymentDetails(User user, Payment payment) {
        paymentInterface.storePaymentDetails(user, payment);
    }
}
