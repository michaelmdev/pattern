package principles.ocp.perfect;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

// САПР
public class CAD {
    // упорядоченная отрисовка
    public void drawAllOrdered(Shape[] shapes) {
        // копируем исходный массив, т.к. порядок элементов будет изменен
        Shape[] clone = shapes.clone();
        // сортировка, используем уже готовую внешнюю абстракцию компаратора java.util.Arrays.Comparator имплементированную в классе ShapeOrderComparator
        java.util.Arrays.sort(clone, new ShapeOrderComparator());
        drawAll(clone);
    }
    public void drawAll(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
