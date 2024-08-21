package org.example.code.abstraction;

public class GoldLoan extends AbstractLoan {

    // Constructor to initialize interest rate, loan amount, and loan holder name for a gold loan
    public GoldLoan(double interestRate, double loanAmount, String loanHolderName) {
        super(interestRate, loanAmount, loanHolderName);
    }

    // Implementation of the abstract method from AbstractLoan
    @Override
    public double calculateLoanAmount(double principal, int termInYears) {
        double discountedRate = getInterestRate() - 2.0; // Discount for gold loan
        return principal * (1 + (discountedRate / 100) * termInYears);
    }
}
