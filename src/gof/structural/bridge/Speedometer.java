package gof.structural.bridge;// program@globall.ru @ 10.05.2017.

public class Speedometer implements SensorImpl {
    @Override
    public double getValue() {
        return Math.random();
    }
}
