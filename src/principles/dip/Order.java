package principles.dip;

/**
 * @author michael.malevannyy@gmail.com, 13.03.2017
 */

// Заказ
public class Order {
    // добавить товар в заказ
    public void add(ItemInterface item) {
        total.add(item.getPrice());
    }

    Money total;
}
