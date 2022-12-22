package curs07.concurrency.challenge2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount01 = new BankAccount("bankAccount01", 1000);
        BankAccount bankAccount02 = new BankAccount("bankAccount02", 200);
        TransactionThread transactionThread01 = new TransactionThread(
                "transactionThread01",
                bankAccount01,
                bankAccount02,
                300
        );
        TransactionThread transactionThread02 = new TransactionThread(
                "transactionThread02",
                bankAccount02,
                bankAccount01,
                700
        );
        System.out.println("Initial balance sheet:");
        System.out.println(bankAccount01);
        System.out.println(bankAccount02);
        transactionThread01.start();
        transactionThread02.start();

    }
}
