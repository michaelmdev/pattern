package gof.behavioral.strategy;

import org.joda.money.Money;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

// интерфейс стратегии, общая задача любой стретегии - провести платеж на конкретную сумму
public interface PaymentStrategy {
    void pay(Money amount);
}
