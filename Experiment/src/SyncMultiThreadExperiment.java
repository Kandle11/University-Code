//
//class BankAccount {
//    private int balance;
//
//    public BankAccount(int balance) {
//        this.balance = balance;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void withdraw(String name, int amount) {
//        if (balance >= amount) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            balance -= amount;
//            System.out.println(name + " 取款 " + amount + " 成功，当前余额：" + balance);
//        } else {
//            System.out.println(name + " 取款 " + amount + " 失败，余额不足，当前余额：" + balance);
//        }
//    }
//}
//
//class WithdrawThread extends Thread {
//    private BankAccount account;
//    private int amount;
//
//    public WithdrawThread(String name, BankAccount account, int amount) {
//        super(name);
//        this.account = account;
//        this.amount = amount;
//    }
//
//    @Override
//    public void run() {
//        account.withdraw(getName(), amount);
//    }
//}
//
//class WithdrawTask implements Runnable {
//    private BankAccount account;
//    private int amount;
//
//    public WithdrawTask(BankAccount account, int amount) {
//        this.account = account;
//        this.amount = amount;
//    }
//
//    @Override
//    public void run() {
//        account.withdraw(Thread.currentThread().getName(), amount);
//    }
//}
//
//public class MultiThreadExperiment {
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("=== Thread子类方式创建线程 ===");
//        BankAccount account1 = new BankAccount(100);
//        WithdrawThread t1 = new WithdrawThread("线程A", account1, 30);
//        WithdrawThread t2 = new WithdrawThread("线程B", account1, 40);
//        WithdrawThread t3 = new WithdrawThread("线程C", account1, 50);
//        t1.start();
//        t2.start();
//        t3.start();
//        t1.join();
//        t2.join();
//        t3.join();
//
//        System.out.println("\n=== Runnable接口方式创建线程（共享任务） ===");
//        BankAccount account2 = new BankAccount(100);
//        WithdrawTask task = new WithdrawTask(account2, 30);
//        Thread thread1 = new Thread(task, "线程A");
//        Thread thread2 = new Thread(task, "线程B");
//        Thread thread3 = new Thread(task, "线程C");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread1.join();
//        thread2.join();
//        thread3.join();
//    }
//}

class SyncBankAccount {
    private int balance;

    public SyncBankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(name + " 取款 " + amount + " 成功，当前余额：" + balance);
        } else {
            System.out.println(name + " 取款 " + amount + " 失败，余额不足，当前余额：" + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class SyncWithdrawThread extends Thread {
    private SyncBankAccount account;
    private int amount;

    public SyncWithdrawThread(String name, SyncBankAccount account, int amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(getName(), amount);
    }
}

class SyncWithdrawTask implements Runnable {
    private SyncBankAccount account;
    private int amount;

    public SyncWithdrawTask(SyncBankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(Thread.currentThread().getName(), amount);
    }
}

public class SyncMultiThreadExperiment {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Thread子类方式 + 同步控制 ===");
        SyncBankAccount account1 = new SyncBankAccount(100);
        SyncWithdrawThread t1 = new SyncWithdrawThread("线程A", account1, 30);
        SyncWithdrawThread t2 = new SyncWithdrawThread("线程B", account1, 40);
        SyncWithdrawThread t3 = new SyncWithdrawThread("线程C", account1, 50);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("\n=== Runnable接口方式 + 同步控制 ===");
        SyncBankAccount account2 = new SyncBankAccount(100);
        SyncWithdrawTask task = new SyncWithdrawTask(account2, 30);
        Thread thread1 = new Thread(task, "线程A");
        Thread thread2 = new Thread(task, "线程B");
        Thread thread3 = new Thread(task, "线程C");
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}