package gof.structural.proxy;

import gof.Money;

import java.util.Currency;
import java.util.Locale;

// синтетический пример использования
public class Client {
    public void demo() {
        // создаем сервис
        CurrencyRateService currencyRateService = new ProxyCurrencyRateService();

        // получаем курс из кэша или от цб - это уже решает прокси
        Money rate = currencyRateService.getCurrencyRate(Currency.getInstance(Locale.US));
    }
}
