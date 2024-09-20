package OOP.coding.abstraction;

public class Counter {
    public static void main(String[] args) {
        PersonalLoan loan = (PersonalLoan) getLoan();
        loan.calculateLoanAmount(10,5);
    }

    public static Loan getLoan(){
        Loan loan = new GoldLoan(16.5, 130000, "kamal");
        return loan;
    }
}
