package gof.behavioral.strategy;

import gof.Payment;
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

    public boolean pay(PaymentStrategy strategy) {

    }

    public Money getTotal() {
        List<Money> monies = new ArrayList<>();
        for (Item item : items)
            monies.add(item.getPrice());
        return Money.total(monies);
    }
}
