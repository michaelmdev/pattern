package principles.lsp.immutable;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

// Прямоугольник // неизменяемый
public class Rectangle {
    private final int height;
    private final int width;

    public Rectangle(int h, int w ) {
        height = h;
        width = w;
    }

    public int getArea() { return  width * height;}
}
