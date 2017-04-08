package gof.structural.proxy;

import gof.Money;

import java.util.Currency;

// интерфейс валюты 
public interface CurrencyRateService {
    // получить курс валюты, в рублях
    Money getCurrencyRate(Currency currency);
}
