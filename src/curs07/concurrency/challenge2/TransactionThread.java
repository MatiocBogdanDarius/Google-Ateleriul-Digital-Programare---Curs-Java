package curs07.concurrency.challenge2;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private synchronized void transfer(BankAccount from, BankAccount to, int amount){
        int initialTotal = from.getDebit() + to.getDebit();
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (InsufficientFundsException e) {
            int currentTotal = from.getDebit() + to.getDebit();
            if(currentTotal > initialTotal){
                try {
                    to.withdraw(amount);
                } catch (InsufficientFundsException ex) {
                    System.out.println("ERROR");
                }
            }
            System.out.println(name + ": " + e.getMessage());
        } finally {
            System.out.println("Balance sheet after " + name + ":");
            System.out.println(from);
            System.out.println(to);
        }

    }
}
