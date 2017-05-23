package gof.behavioral.strategy;

import org.joda.money.Money;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

// плтаеж через PayPal
public final class PayPalPaymentStrategy implements PaymentStrategy {
    // учетная информация для авторизации PayPal
    private final String email;
    private final String token;

    // разные стратегии требуют разной учетной информации о средстве платежа
    public PayPalPaymentStrategy(String email, String token) {
        this.email = email;
        this.token = token;
    }

    @Override
    public void pay(Money amount) {
        System.out.printf("processing %s via PayPal account %s\n", amount.toString(), email);
    }
}
