package enterprise.joda;

import org.joda.money.Money;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static org.joda.money.CurrencyUnit.USD;

/**
 * @author michael.malevannyy@gmail.com, 19.05.2017
 */

class JodaMoneyTest {

    @Test
    public void run() {

        Money money = Money.of(USD, (double) 1 / 3, RoundingMode.HALF_EVEN);

        Money money1 = money.plus(Money.of(USD, 1));

        BigInteger bigInteger = BigInteger.valueOf(1);


        BigDecimal bigDecimal = new BigDecimal(5);
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
    }
}