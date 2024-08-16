package com.bank.account;

public class SeniorCitizenAccount extends SavingAccount {
    private int age;

    public SeniorCitizenAccount(String accNo, String holderName, double balance, double interestRate, int age) {
        super(accNo, holderName, balance, interestRate);
        this.age = age;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance - amount > 0 && this.age > 60) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance or age is less than 60");
        }
    }

    /**
     * This is an example for method overriding.
     * Same signature as the parent class method.
     * Parent deposit method is overridden in this class.
     */
    @Override
    public void deposit(double amount) {
        if (this.age >= 60) {
            this.balance += amount;
        } else {
            System.out.println("You are not a senior citizen, you can't deposit money");
        }
    }
}
