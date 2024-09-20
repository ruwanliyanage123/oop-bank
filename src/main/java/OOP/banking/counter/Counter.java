package OOP.banking.counter;

import OOP.banking.account.BankAccount;
import OOP.banking.account.SavingAccount;
import OOP.banking.account.FixedDepositAccount;
import OOP.banking.account.SeniorCitizenAccount;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private static final double MINIMUM_TAXABLE_AMOUNT = 1000;
    public static void main(String[] args) {
        final List<BankAccount> bankAccounts = createBankAccounts();
        final List<BankAccount> taxableAccounts = findTaxableAccounts(bankAccounts, MINIMUM_TAXABLE_AMOUNT);
        printAccountDetails(taxableAccounts);

    }

    public static List<BankAccount> createBankAccounts() {
        List<BankAccount> accounts = new ArrayList<>();

        //to create a list of saving accounts
        BankAccount account1 = new SavingAccount("1", "Holder 1", 1000, 5);
        BankAccount account2 = new SavingAccount("2", "Holder 2", 5000, 5);
        BankAccount account3 = new SavingAccount("3", "Holder 3", 2000, 5);
        BankAccount account4 = new SavingAccount("4", "Holder 4", 1500, 5);

        //to create a list of fixed deposit accounts
        BankAccount account5 = new FixedDepositAccount("5", "Holder 5", 500000, 6, 12, null);
        BankAccount account6 = new FixedDepositAccount("6", "Holder 6", 100000, 6, 12, null);
        BankAccount account7 = new FixedDepositAccount("7", "Holder 7", 600000, 6, 12, null);

        //to create a list of senior citizen accounts
        BankAccount account8 = new SeniorCitizenAccount("8", "Holder 8", 15000, 15, 65);
        BankAccount account9 = new SeniorCitizenAccount("9", "Holder 9", 25000, 15, 65);
        BankAccount account10 = new SeniorCitizenAccount("10", "Holder 10", 9000, 15, 65);

        //add all the accounts to the list
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        accounts.add(account6);
        accounts.add(account7);
        accounts.add(account8);
        accounts.add(account9);
        accounts.add(account10);
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

    public static List<BankAccount> findNonSeniorTaxableAccounts(List<BankAccount> accounts, double minimumTaxableAmount) {
        final List<BankAccount> taxableAccounts = new ArrayList<>();
        for (BankAccount account : accounts) {
            if (account.getBalance() >= minimumTaxableAmount && !isSeniorCitizen(account)) {
                taxableAccounts.add(account);
            }
        }
        return taxableAccounts;
    }

    public static boolean isSeniorCitizen(BankAccount account) {
        return account instanceof SeniorCitizenAccount;
    }

    public static void printAccountDetails(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println(account.getAccNo() + " : " + account.getBalance() + " : " + account.getHolderName());
        }
    }
}
