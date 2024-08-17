package com.bank.account;

import com.bank.payment.Payment;

import java.util.Date;


public class GeneralSavingAccount extends SavingAccount implements Payment {
    public GeneralSavingAccount(String accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance, interestRate);
    }

    @Override
    public void pay(double amount) {
        if(balance - amount > 0){
            System.out.println("Payment successful...");
        }else{
            System.out.println("Payment Fail...");
        }
    }

    @Override
    public void pay(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + ".");
    }

    @Override
    public void pay(double amount, String fromAccount, String toAccount) {
        System.out.println("Transferring " + amount + " from account " + fromAccount + " to account " + toAccount + ".");
    }

    @Override
    public void pay(double amount, String billInvoice, String creditCardNo, Date date) {
        System.out.println("Paying " + amount + " for invoice " + billInvoice + " using credit card " + creditCardNo + " on date " + date + ".");
    }
}
