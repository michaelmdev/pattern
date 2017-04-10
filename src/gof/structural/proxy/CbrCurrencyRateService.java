package gof.structural.proxy;

import gof.Money;

import java.util.Currency;

// ревльный сервис куров валют, при каждом обращении запрашивает курс у ЦБ, а) долго б) использует интернет
public class CbrCurrencyRateService implements CurrencyRateService {
    @Override
    public Money getCurrencyRate(Currency currency) {
        //... особенности реализации опущены
        // инретересующиеся могут ознакомиться тут http://cbr.ru/scripts/Root.asp?PrtId=SXML
        return null;
    }
}
