package principles.ocp.good;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

// САПР
public class CAD {
    public void drawAll(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    // решение "в лоб" - не самое удачное
    public void drawAllCirclesFirst(Shape[] shapes) {
        for (Shape shape : shapes) {
            if(shape instanceof Circle)
                shape.draw();
        }
        for (Shape shape : shapes) {
            if(shape instanceof Triangle)
                shape.draw();
        }
    }
}
