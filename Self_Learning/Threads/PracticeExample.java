package Self_Learning.Threads;

// interface loosely coupled concept : flexibility
interface Transaction {
    void execute();
}

// class that implements interface 
class Deposit implements Transaction {

    private BankAccount account;
    private int amount;

    public Deposit(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }


    public void execute() {
        account.deposit(amount);
    }

}

// this class also implements interface
class Withdraw implements Transaction {

    private BankAccount account;
    private int amount;

    public Withdraw(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.withdraw(amount);
    }

}

// this class is use to make the object of Bank Account
class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // why synchronised 
    // we want ki ek time par ek hi thread chale 
    // ek ke completely khatam ho jane ke baad dusra 
    public synchronized void deposit(int amount) {

        balance = balance + amount;

        System.out.println(
            Thread.currentThread().getName()
            + " deposited " + amount
            + " | Balance: " + balance
        );
    }

    public synchronized void withdraw(int amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(
                Thread.currentThread().getName()
                + " withdrew " + amount
                + " | Balance: " + balance
            );

        } else {

            System.out.println(
                Thread.currentThread().getName()
                + " failed to withdraw " + amount
                + " | Insufficient balance"
            );
        }
    }

    public int getBalance() {
        return balance;
    }

}

// class that extends Thread
// iss class se Thread banege
// why do we using thread : har bank ke task ko ek unit ki tarah mana hai 
class TransactionThread extends Thread {

    private Transaction transaction;

    public TransactionThread(Transaction transaction,String threadName) {
        super(threadName);
        this.transaction = transaction;
    }

    public void run() {
        transaction.execute();
    }
}

public class PracticeExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);


        Transaction deposit1 =
            new Deposit(account, 2000);

        Transaction withdraw1 =
            new Withdraw(account, 3000);

        Transaction withdraw2 =
            new Withdraw(account, 4000);

        Transaction deposit2 =
            new Deposit(account, 1000);

        Transaction withdraw3 =
            new Withdraw(account, 2000);


        TransactionThread t1 =
            new TransactionThread(deposit1, "Thread-1");

        TransactionThread t2 =
            new TransactionThread(withdraw1, "Thread-2");

        TransactionThread t3 =
            new TransactionThread(withdraw2, "Thread-3");

        TransactionThread t4 =
            new TransactionThread(deposit2, "Thread-4");

        TransactionThread t5 =
            new TransactionThread(withdraw3, "Thread-5");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        try {

            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted.");
        }


        System.out.println(
            "Final Balance: " + account.getBalance()
        );
    }
}