package curs07.concurrency.challenge2;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds!");
    }
}
