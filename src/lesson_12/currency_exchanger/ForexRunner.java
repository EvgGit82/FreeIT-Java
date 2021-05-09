package lesson_12.currency_exchanger;

import lesson_12.currency_exchanger.models.CurrencyExchangeOffice;

public class ForexRunner {

    public static void main(String[] args) {
        CurrencyExchangeOffice exchangeOffice
                = new CurrencyExchangeOffice(1, 204, 2465, 54564);

        System.out.println(exchangeOffice);
    }

}
