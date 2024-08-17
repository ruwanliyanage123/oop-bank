package org.example.code.abstraction;

// Define an interface for loans
public interface Loan {
    // Abstract methods that must be implemented by any class that implements this interface
    public abstract double getInterestRate();
    public abstract double calculateLoanAmount(double principal, int termInYears);
}
