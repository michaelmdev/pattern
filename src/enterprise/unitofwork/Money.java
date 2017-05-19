package enterprise.unitofwork;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * @author michael.malevannyy@gmail.com, 17.05.2017
 */

public class Money {
    private final Currency currency;
    private final BigDecimal amount;

    private final int x=0;

    public Money(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;


    }

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = BigDecimal.valueOf(amount).stripTrailingZeros();
    }

    public void add(Money money) {
        this.amount.add(money.amount);
    }
}
