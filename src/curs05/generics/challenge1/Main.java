package curs05.generics.challenge1;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        exchangeDesk.addRate(RON.class, USD.class, 4.1d);
        RON lei = new RON(1_000);
        USD dollar = exchangeDesk.convert(lei, USD.class);
        System.out.println(dollar);
    }
}
