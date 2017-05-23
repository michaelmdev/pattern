package gof.behavioral.strategy;

import org.joda.money.Money;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

// оплата кредитной картой
public final class CreditCardPaymentStrategy implements PaymentStrategy {
    private final CreditCard card;

    // в данном случе требуется кредитка
    public CreditCardPaymentStrategy(CreditCard card) {
        this.card = card;
    }

    @Override
    public void pay(Money amount) {
        System.out.printf("processing %s via credit card %s\n", amount.toString(), card.getNumber());
    }
}
