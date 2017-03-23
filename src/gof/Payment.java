package gof;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 *
 * Интерфейс платежа
 */

public interface Payment {
    Money getMoney();
    void setMoney(Money money);
}
