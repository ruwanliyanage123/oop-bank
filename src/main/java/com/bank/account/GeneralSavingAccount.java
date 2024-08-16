package com.bank.account;

import com.bank.payment.Payment;

import java.util.Date;


public class GeneralSavingAccount extends SavingAccount implements Payment {
    public GeneralSavingAccount(String accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance, interestRate);
    }

    @Override
    public void pay(double amount) {
        //todo: implement payment logic
    }

    @Override
    public void pay(double amount, String currency) {
      //todo: implement payment logic
    }

    @Override
    public void pay(double amount, String fromAccount, String toAccount) {
        //todo: implement payment logic
    }

    @Override
    public void pay(double amount, String billInvoice, String creditCardNo, Date date) {
        //todo: implement payment logic
    }
}
