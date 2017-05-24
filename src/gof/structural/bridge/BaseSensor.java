package gof.structural.bridge;// program@globall.ru @ 10.05.2017.

public class BaseSensor extends AbstractSensor {
    public BaseSensor(SensorImpl implementor) {
        super(implementor);
    }

    public double getValue() {
        return implementor.getValue();
    }
}
