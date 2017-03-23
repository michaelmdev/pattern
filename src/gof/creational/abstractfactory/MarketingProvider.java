package gof.creational.abstractfactory;

import gof.Money;

/**
 * @author michael.malevannyy@gmail.com, 23.03.2017
 */

public interface MarketingProvider {
    void claimSales();
    Money getBonus();
}
