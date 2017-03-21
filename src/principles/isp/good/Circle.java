package principles.isp.good;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

// Круг, печататаемый реализует интерфейс печатаемого
class Circle implements Shape, Plotable {
    @Override
    public void draw() {/* нарисовать */}

    @Override
    public void plot() {/* напечатать */}
}
