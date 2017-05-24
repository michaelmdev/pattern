package gof.structural.bridge;// program@globall.ru @ 10.05.2017.

public abstract class AbstractSensor {
    SensorImpl implementor;

    public AbstractSensor(SensorImpl implementor) {
        this.implementor = implementor;
    }
}
