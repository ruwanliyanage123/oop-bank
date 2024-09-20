package oop.banking.account;

public abstract class BankAccount {
    private String accNo;//private access modifier
    private String holderName;
    protected double balance;//protected access modifier

    /**
     * Constructor to initialize the BankAccount object.
     * This is an abstract class, so we can't create an object of this class.
     * Even though we can't create an object of this class, we can create a constructor.
     * We can use this to reuse the code in the child classes.
     */
    public BankAccount(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);//abstract method

    public abstract void withdraw(double amount);//abstract method

    // getters and setters
    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


//todo: add this to question pack...
//todo: need to do a proper example for this.