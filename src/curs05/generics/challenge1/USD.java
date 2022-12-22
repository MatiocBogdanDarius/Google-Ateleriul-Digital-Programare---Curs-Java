package curs05.generics.challenge1;

public class USD extends Currency{
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "USD{amount = " + getAmount() + "}";
    }
}
