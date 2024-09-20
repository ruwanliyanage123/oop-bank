package designpatterns.builder;

import java.time.LocalDate;

public class BankAccount {
    // Instance variables
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String accountType;
    private double interestRate;
    private double withdrawalLimit;
    private LocalDate creationDate;
    private LocalDate lastTransactionDate;
    private String branchName;
    private String branchCode;
    private boolean isSuspended;
    private String currency;
    private String phoneNumber;
    private String email;
    private String address;
    private boolean overdraftProtection;

    // Constructor
    public BankAccount(String accountNumber,
                       String accountHolderName,
                       String branchName,
                       String branchCode,
                       String currency,
                       String phoneNumber,
                       String email,
                       String accountType,
                       double accountBalance,
                       double interestRate, double withdrawalLimit,
                       LocalDate creationDate, LocalDate lastTransactionDate,
                       boolean isSuspended,

                       String address, boolean overdraftProtection) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.withdrawalLimit = withdrawalLimit;
        this.creationDate = creationDate;
        this.lastTransactionDate = lastTransactionDate;
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.isSuspended = isSuspended;
        this.currency = currency;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.overdraftProtection = overdraftProtection;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(LocalDate lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(boolean overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }
}

