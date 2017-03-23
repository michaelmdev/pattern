package gof.creational.abstractfactory.citilink;

import gof.creational.abstractfactory.DocProvider;
import gof.creational.abstractfactory.ExchangeFactory;
import gof.creational.abstractfactory.MarketingProvider;
import gof.creational.abstractfactory.PriceProvider;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 */

public class CitilinkExchangeFactory implements ExchangeFactory {

    @Override
    public PriceProvider createPriceProvider() {
        return new CitilinkPriceProvider();
    }

    @Override
    public DocProvider createDocProvider() {
        return new CitilinkDocProvider();
    }

    @Override
    public MarketingProvider createMarketingProvider() {
        return new CitilinkMarketingProvider();
    }
}
