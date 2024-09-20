package oop.coding.abstraction;

public class PersonalLoan extends AbstractLoan {

    // Constructor to initialize interest rate, loan amount, and loan holder name for a personal loan
    public PersonalLoan(double interestRate, double loanAmount, String loanHolderName) {
        super(interestRate, loanAmount, loanHolderName);
    }

    // Implementation of the abstract method from AbstractLoan
    @Override
    public double calculateLoanAmount(double principal, int termInYears) {
        // Simple calculation for demonstration: A = P(1 + rt)
        // A = amount, P = principal, r = interest rate, t = term in years
        return principal * (1 + (getInterestRate() / 100) * termInYears);
    }
}
