package gof.creational.abstractfactory;

import gof.Money;

/**
 * @author michael.malevannyy@gmail.com, 22.03.2017
 */

public class Client {

    public Money getSupplierPrice(String supplierName, String article) throws InstantiationException, IllegalAccessException {

            // создать абстрактную фабрику сервисов конкретного поставщика
            ExchangeFactory exchangeFactory = Fabric.getInstance().createFactory(supplierName);

            // создать фабрикой конкретного поставщика его провайдер некоторых услуг
            PriceProvider priceProvider = exchangeFactory.createPriceProvider();

            // получаить услугу
            Money price = priceProvider.getPrice(article);

            return price;
    }
}
