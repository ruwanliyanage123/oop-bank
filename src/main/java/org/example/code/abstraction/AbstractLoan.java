package org.example.code.abstraction;

// Define an abstract class that implements the Loan interface
public abstract class AbstractLoan implements Loan {
    private double interestRate;
    private double loanAmount;
    private String loanHolderName;

    // Constructor to initialize interest rate, loan amount, and loan holder name
    public AbstractLoan(double interestRate, double loanAmount, String loanHolderName) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.loanHolderName = loanHolderName;
    }

    // Implementation of the getInterestRate method from the Loan interface
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    // Getter and Setter for loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Getter and Setter for loanHolderName
    public String getLoanHolderName() {
        return loanHolderName;
    }

    public void setLoanHolderName(String loanHolderName) {
        this.loanHolderName = loanHolderName;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateLoanAmount(double principal, int termInYears);

    // A concrete method to display loan details
    public void displayLoanDetails(int termInYears) {
        double amount = calculateLoanAmount(loanAmount, termInYears);
        System.out.println("Loan Holder Name: " + loanHolderName);
        System.out.println("Loan Amount: " + amount);
        System.out.println("Interest Rate: " + getInterestRate() + "%");
    }
}
