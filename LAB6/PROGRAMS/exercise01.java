package lab06;

class BankAccount {
    private int balance = 1000;

    // Synchronized method to ensure thread safety
    synchronized void withdraw(int amount, String threadName) {
        if (balance >= amount) {
            System.out.println(threadName + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(threadName + " withdraws " + amount + ", remaining balance: " + balance);
        } else {
            System.out.println(threadName + " tried to withdraw " + amount + " but insufficient funds.");
        }
    }
}

class WithdrawThread extends Thread {
    BankAccount account;
    int amount;
    String threadName;

    WithdrawThread(BankAccount account, int amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }

    public void run() {
        account.withdraw(amount, threadName);
    }
}

public class exercise01 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account, 600, "Thread-1");
        WithdrawThread t2 = new WithdrawThread(account, 500, "Thread-2");

        t1.start();
        t2.start();
    }
}
