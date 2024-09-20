package OOP.banking.account;

import java.util.Date;

//FixedDepositAccount class extends BankAccount abstract class (inheritance)
public class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int durationInMonths;
    private Date maturityDate;

    public FixedDepositAccount(String accNo, String holderName, double balance, double interestRate, int durationInMonths, Date maturityDate) {
        super(accNo, holderName, balance);//calling the parent class constructor
        this.interestRate = interestRate; //initializing the interestRate
        this.durationInMonths = durationInMonths;//initializing the durationInMonths
        this.maturityDate = maturityDate;//initializing the maturityDate
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * This is an example for method overriding.
     * Same signature as the parent class method.
     * Parent withdraw method is overridden in this class.
     */
    @Override
    public void withdraw(double amount) {
        if (this.balance - amount > 0 && new Date().after(this.maturityDate)) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance or maturity date is not reached");
        }
    }

    // getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }
}
