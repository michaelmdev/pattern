package gof.creational.abstractfactory.ulmart;

import gof.Money;
import gof.creational.abstractfactory.PriceProvider;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 */

public class UlmartPriceProvider implements PriceProvider {
    @Override
    public Money getPrice(String article) {
        return null;
    }
}
