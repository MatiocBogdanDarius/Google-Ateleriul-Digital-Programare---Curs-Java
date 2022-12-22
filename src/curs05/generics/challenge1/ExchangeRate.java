package curs05.generics.challenge1;

import java.util.Objects;

public class ExchangeRate<T extends Currency, U extends Currency> {
    private Class<T> from;
    private Class<U> to;
    private double rate;

    public ExchangeRate(Class<T> from, Class<U> to, double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void update(ExchangeRate exchangeRate) {
        rate = exchangeRate.rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeRate that = (ExchangeRate) o;
        return from.equals(that.from) && to.equals(that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
