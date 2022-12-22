package curs05.generics.challenge1;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ExchangeDesk {
    private List<ExchangeRate> exchangeRates;

    public ExchangeDesk() {
        this.exchangeRates = new ArrayList<>();
    }

    public <T extends Currency, U extends Currency> void addRate(Class<T> from, Class<U> to, double rate){
        ExchangeRate newExchangeRate = new ExchangeRate(from, to, rate);
        int index = exchangeRates.indexOf(newExchangeRate);
        if(index == -1){
            exchangeRates.add(newExchangeRate);
        } else {
            exchangeRates.get(index).update(newExchangeRate);
        }
    }

    public <T extends Currency, U extends Currency> U convert(T from, Class<U> to) throws Exception {
        ExchangeRate exchangeRate = new ExchangeRate<>(from.getClass(), to, 0);
        int indexExchangeRate = exchangeRates.indexOf(exchangeRate);
        if(indexExchangeRate == -1){
            throw new Exception(
                    "This exchange desk dont have exchange rate from " +
                    from.getClass().getSimpleName() + " to " + to.getSimpleName() + "!"
            );
        }
        Double rate = exchangeRates.get(indexExchangeRate).getRate();
        return to.getConstructor(double.class).newInstance(from.getAmount() * rate);
    }
}
