package curs07.concurrency.challenge2;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public int getDebit() {
        return debit;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if(amount > debit){
            throw new InsufficientFundsException();
        }
        debit -= amount;
    }

    public void deposit(double amount){
        longDatabaseCall();
        debit += amount;
    }

    public void longDatabaseCall(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
