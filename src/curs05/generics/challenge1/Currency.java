package curs05.generics.challenge1;

public abstract class Currency {
    private Double amount;

    public Currency(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
