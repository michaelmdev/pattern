package gof.behavioral.strategy;

import org.joda.money.Money;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

public final class Item {
    private final String name;
    private final Money price;

    public Item(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
