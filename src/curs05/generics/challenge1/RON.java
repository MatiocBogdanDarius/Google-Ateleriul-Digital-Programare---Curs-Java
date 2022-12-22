package curs05.generics.challenge1;

public class RON extends Currency{
    public RON(double amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "RON{amount = " + getAmount() + "}";
    }
}
