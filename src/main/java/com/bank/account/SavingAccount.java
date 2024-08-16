package com.bank.account;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    // getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
