package com.bank.counter;

import com.bank.account.BankAccount;
import com.bank.account.FixedDepositAccount;
import com.bank.account.SavingAccount;
import com.bank.account.SeniorCitizenAccount;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private static final double MINIMUM_TAXABLE_AMOUNT = 10000;
    public static void main(String[] args) {
        final List<BankAccount> bankAccounts = createBankAccounts();
        final List<BankAccount> taxableAccounts = findTaxableAccounts(bankAccounts, MINIMUM_TAXABLE_AMOUNT);
        printAccountDetails(taxableAccounts);
    }

    public static List<BankAccount> createBankAccounts() {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingAccount("1", "Holder 1", 15000, 5));
        accounts.add(new SavingAccount("2", "Holder 2", 25000, 5));
        accounts.add(new SavingAccount("3", "Holder 3", 35000, 5));
        accounts.add(new SavingAccount("4", "Holder 4", 45000, 5));
        accounts.add(new FixedDepositAccount("5", "Holder 5", 500000, 6, 12, null));
        accounts.add(new FixedDepositAccount("6", "Holder 6", 150000, 6, 12, null));
        accounts.add(new FixedDepositAccount("7", "Holder 7", 250000, 6, 12, null));
        accounts.add(new FixedDepositAccount("8", "Holder 8", 350000, 6, 12, null));
        accounts.add(new SeniorCitizenAccount("9", "Holder 9", 25000, 15, 65));
        accounts.add(new SeniorCitizenAccount("10", "Holder 10", 25000, 15, 62));
        accounts.add(new SeniorCitizenAccount("11", "Holder 11", 25000, 15, 62));
        accounts.add(new SeniorCitizenAccount("12", "Holder 12", 25000, 15, 75));
        accounts.add(new SeniorCitizenAccount("13", "Holder 13", 25000, 15, 69));
        return accounts;
    }


    public static List<BankAccount> findTaxableAccounts(List<BankAccount> accounts, double minimumTaxableAmount) {
        final List<BankAccount> taxableAccounts = new ArrayList<>();
        for (BankAccount account : accounts) {
            if (account.getBalance() >= minimumTaxableAmount) {
                taxableAccounts.add(account);
            }
        }
        return taxableAccounts;
    }

    public static void printAccountDetails(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println(account.getAccNo() + " : " + account.getBalance() + " : " + account.getHolderName());
        }
    }
}
