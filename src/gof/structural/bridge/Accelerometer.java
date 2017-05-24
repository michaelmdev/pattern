package gof.structural.bridge;// program@globall.ru @ 10.05.2017.

public class Accelerometer implements SensorImpl {
    @Override
    public double getValue() {
        return 1/Math.random();
    }
}
