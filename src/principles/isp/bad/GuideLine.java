package principles.isp.bad;

/**
 * @author michael.malevannyy@gmail.com, 16.03.2017
 */

// направляющая, не печатная
class GuideLine implements Shape {
    @Override
    public void draw() {/* нарисовать */}

    // пустой метод, вынужденная реализация
    @Override
    public void plot() {}
}
