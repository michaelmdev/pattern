package gof.creational.abstractfactory.citilink;

import gof.Money;
import gof.creational.abstractfactory.MarketingProvider;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 */

public class CitilinkMarketingProvider implements MarketingProvider {
    @Override
    public void claimSales() {

    }

    @Override
    public Money getBonus() {
        return null;
    }
}
