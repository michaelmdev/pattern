package principles.ocp.bad;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

// САПР
public class CAD {
    public void drawAll(Shape[] shapes) {
        for (Shape shape : shapes) {
            // выбор поведения в зависимости от типа входного объекта
            if (shape instanceof Circle) {
                drawCircle((Circle) shape);
            }
            else if (shape instanceof Triangle) {
                drawTriangle((Triangle) shape);
            }
        }
    }

    // рисуем круг
    public void drawCircle(Circle circle) { }

    // рисуем треугольник
    public void drawTriangle(Triangle triangle) { }
}
