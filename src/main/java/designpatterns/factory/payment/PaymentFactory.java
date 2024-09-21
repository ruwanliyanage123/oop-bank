package designpatterns.factory.payment;

public class PaymentFactory {
    private PaymentFactory() {
    }

    public static PaymentMethod createPaymentMethod(String methodType) {
        switch (methodType) {
            case "CreditCard":
                return new CreditCard();
            case "PayPal":
                return new PayPal();
            case "Bitcoin":
                return new Cash();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + methodType);
        }
    }
}
