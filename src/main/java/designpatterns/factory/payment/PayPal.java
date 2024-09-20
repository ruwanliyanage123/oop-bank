package designpatterns.factory.payment;

public class PayPal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
