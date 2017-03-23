package gof.creational.abstractfactory;

import gof.Money;

/**
 * @author michael.malevannyy@gmail.com, 22.03.2017
 */

public interface PriceProvider {
    Money getPrice(String article);
}
