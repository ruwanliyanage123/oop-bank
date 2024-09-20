package OOP.banking.account;

public class ChildSavingAccount extends SavingAccount{
    private int age;

    public ChildSavingAccount(String accNo, String holderName, double balance, double interestRate, int age) {
        super(accNo, holderName, balance, interestRate);
        this.age = age;
    }

    /**
     * This is an example for method overriding.
     * Same signature as the parent class method.
     * Parent withdraw method is overridden in this class.
     */
    @Override
    public void withdraw(double amount) {
        if (this.balance - amount > 0 && this.age > 18) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance or age is less than 18");
        }
    }

    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
