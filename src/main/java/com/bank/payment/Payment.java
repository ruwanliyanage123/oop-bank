package com.bank.payment;

import java.util.Date;

/**
 * This is an example for an interface.
 * According to the SOLID single responsible principle, this interface is responsible for payment related operations.
 * This interface has abstract methods for payment operations.
 * This is example for the method overloading as well
 * To do method overloading, we need to have the different method signatures.
 * Method signature mean, method name and the parameters. (number of parameters, order of parameters, type of parameters)
 * In this interface, we have multiple pay methods with different parameters.
 */
public interface Payment {
    public static final int MAX_PAYMENT_LIMIT = 10000;
    public abstract void pay(double amount);

    /**
     * To do payment for different currency.
     */
    public abstract void pay(double amount, String currency);

    /**
     * To do own account payment transfer.
     */
    public abstract void pay(double amount, String fromAccount, String toAccount);

    /**
     * To do payment for the bill by credit card.
     */
    public abstract void pay(double amount, String billInvoice, String creditCardNo, Date date);


    /**
     * If you are not willing to force to implement the methods by subclasses, you can use default methods by using default keyword.
     * Interfaces can use default methods as well private methods.
     * variables in the interface are by default public static final.
     * Default methods can have method body.
     * private methods can be used to reuse the code within the interface.
     */
}
