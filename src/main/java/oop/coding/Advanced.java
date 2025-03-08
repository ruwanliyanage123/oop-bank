package oop.coding;

public class Advanced {
    public static void main(String[] args) {
        Account account = new Account("1", "Amal");
        Programme cashier = new Cashier(account);
        Programme printer = new Printer(account);
        Thread exe1 = new Exe(cashier);
        Thread exe2 = new Exe(printer);
        exe1.start();
        exe2.start();
    }
}

class Exe extends Thread{
    private Programme programme;

    Exe(Programme  programme){
        this.programme = programme;
    }

    @Override
    public void run() {
        programme.execute();
    }
}

interface Programme{
    public abstract void execute();
}

class Cashier implements Programme{
    private Account account;

    Cashier(Account account) {
        this.account = account;
    }

    public void execute() {
        synchronized (this.account) {
            int number = 0;
            while (number < 10) {
                System.out.println("thread name:" + Thread.currentThread().getName() + " " + number + " : " + this.account.getHolderName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                number++;
            }
        }
    }
}

class Printer implements Programme{
    private Account account;

    Printer(Account account) {
        this.account = account;
    }

    public void execute() {
        int number = 0;
        while (number < 10) {
            System.out.println("thread name:" + Thread.currentThread().getName() + " " + number + " : " + this.account.getHolderName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            number++;
        }
    }
}

class Account {
    private String accNo;
    private String holderName;

    public Account(String accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
    }

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
}

