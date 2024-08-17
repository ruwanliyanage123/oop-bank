package org.example.code.abstraction;

public class GoldLoan extends AbstractLoan {

    // Constructor to initialize interest rate, loan amount, and loan holder name for a gold loan
    public GoldLoan(double interestRate, double loanAmount, String loanHolderName) {
        super(interestRate, loanAmount, loanHolderName);
    }

    // Implementation of the abstract method from AbstractLoan
    @Override
    public double calculateLoanAmount(double principal, int termInYears) {
        // Gold loans might have a different formula; this is just an example
        // Example formula: A = P * (1 + (r * t)) with a 2% discount on the interest rate
        double discountedRate = getInterestRate() - 2.0; // Discount for gold loan
        return principal * (1 + (discountedRate / 100) * termInYears);
    }
}
