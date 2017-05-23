package gof.behavioral.strategy;

import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

public class Order {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Money getTotal() {
        List<Money> monies = new ArrayList<>();
        for (Item item : items)
            monies.add(item.getPrice());
        return Money.total(monies);
    }

    public void pay(PaymentStrategy strategy) {
        Money total = getTotal();
        strategy.pay(total);
    }
}
