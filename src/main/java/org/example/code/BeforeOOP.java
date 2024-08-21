package org.example.code;

public class BeforeOOP {
    public static void main(String[] args) {






        //we can simply create 10 bank accounts using the class and objects as following code

        PersonalBankAccount account1 = new PersonalBankAccount("1", "Amal", 1000, 5);
        PersonalBankAccount account2 = new PersonalBankAccount("2", "Nimal", 2000, 4.5);
        PersonalBankAccount account3 = new PersonalBankAccount("3", "Sunil", 1500, 4);
        PersonalBankAccount account4 = new PersonalBankAccount("4", "Kamal", 2500, 5.5);
        PersonalBankAccount account5 = new PersonalBankAccount("5", "Ruwan", 3000, 6);
        PersonalBankAccount account6 = new PersonalBankAccount("6", "Saman", 1800, 4.8);
        PersonalBankAccount account7 = new PersonalBankAccount("7", "Bandara", 2200, 5.2);
        PersonalBankAccount account8 = new PersonalBankAccount("8", "Chandana", 2700, 5.7);
        PersonalBankAccount account9 = new PersonalBankAccount("9", "Gayan", 3200, 6.1);
        PersonalBankAccount account10 = new PersonalBankAccount("10", "Lahiru", 3500, 6.3);















        String accNo = "100";
        String holderName = "Saman";
        double balance = 1000;
        double interestRate = 5;

















// Bank account 1
        String accNo1 = "1";
        String holderName1 = "Amal";
        double balance1 = 1000;
        double interestRate1 = 5;

// Bank account 2
        String accNo2 = "2";
        String holderName2 = "Nimal";
        double balance2 = 2000;
        double interestRate2 = 4.5;

// Bank account 3
        String accNo3 = "3";
        String holderName3 = "Sunil";
        double balance3 = 1500;
        double interestRate3 = 4;

// Bank account 4
        String accNo4 = "4";
        String holderName4 = "Kamal";
        double balance4 = 2500;
        double interestRate4 = 5.5;

// Bank account 5
        String accNo5 = "5";
        String holderName5 = "Ruwan";
        double balance5 = 3000;
        double interestRate5 = 6;

// Bank account 6
        String accNo6 = "6";
        String holderName6 = "Saman";
        double balance6 = 1800;
        double interestRate6 = 4.8;

// Bank account 7
        String accNo7 = "7";
        String holderName7 = "Bandara";
        double balance7 = 2200;
        double interestRate7 = 5.2;

// Bank account 8
        String accNo8 = "8";
        String holderName8 = "Chandana";
        double balance8 = 2700;
        double interestRate8 = 5.7;

// Bank account 9
        String accNo9 = "9";
        String holderName9 = "Gayan";
        double balance9 = 3200;
        double interestRate9 = 6.1;

// Bank account 10
        String accNo10 = "10";
        String holderName10 = "Lahiru";
        double balance10 = 3500;
        double interestRate10 = 6.3;


    }
}

class PersonalBankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private double interestRate;

    // to initiate the object
    public PersonalBankAccount(String accountNumber, String holderName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public PersonalBankAccount() {

    }

    // Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }
}

