package gof.creational.abstractfactory.ulmart;

import gof.creational.abstractfactory.DocProvider;
import gof.creational.abstractfactory.ExchangeFactory;
import gof.creational.abstractfactory.MarketingProvider;
import gof.creational.abstractfactory.PriceProvider;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 */

public class UlmartExchangeFactory implements ExchangeFactory {
    @Override
    public PriceProvider createPriceProvider() {
        return new UlmartPriceProvider();
    }

    @Override
    public DocProvider createDocProvider() {
        return new UlmartDocProvider();
    }

    @Override
    public MarketingProvider createMarketingProvider() {
        return new UlmartMarketingProvider();
    }
}
