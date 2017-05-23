package gof.behavioral.strategy;

import org.joda.money.Money;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

public interface PaymentStrategy {
    void collectCredentials();
    void validate();
    Money getAmount();
    String getDetails();
}
