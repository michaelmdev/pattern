package principles.ocp.perfect;

import java.util.Comparator;
import java.util.HashMap;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */
// Имплементация абстракции компаратора
public class ShapeOrderComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        return Integer.compare(getOrder(shape1), getOrder(shape2));
    }

    private int getOrder(Shape shape) {
        return order.containsKey(shape.getClass()) ? order.get(shape.getClass()) : Integer.MAX_VALUE;
    }

    public ShapeOrderComparator() {
        // задаём порядок
        order.put(Circle.class, 1);
        order.put(Triangle.class, 2);
    }

    private final HashMap<Class<? extends Shape>, Integer> order = new HashMap<>();
}
