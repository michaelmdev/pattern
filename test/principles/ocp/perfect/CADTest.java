package principles.ocp.perfect;

import org.junit.jupiter.api.Test;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

class CADTest {
    @Test
    void drawAllOrdered() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();

        new CAD().drawAllOrdered(shapes);

    }
}