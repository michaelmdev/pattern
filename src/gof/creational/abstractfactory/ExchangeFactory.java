package gof.creational.abstractfactory;

/**
 * @author michael.malevannyy@gmail.com, 22.03.2017
 */

public interface ExchangeFactory {
    PriceProvider createPriceProvider();
    DocProvider createDocProvider();
    MarketingProvider createMarketingProvider();
}
