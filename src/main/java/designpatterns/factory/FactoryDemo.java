package designpatterns.factory;

import designpatterns.factory.payment.PaymentFactory;
import designpatterns.factory.payment.PaymentMethod;

public class FactoryDemo {
    private static final String CREDIT_CARD = "CreditCard";
    public static void main(String[] args) {
        PaymentMethod paymentMethod = PaymentFactory.createPaymentMethod(CREDIT_CARD);
    }
}
