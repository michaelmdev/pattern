package gof.structural.bridge;// program@globall.ru @ 10.05.2017.

import java.util.*;

public class AverageSensor extends AbstractSensor {
    private final Queue<Double> queue = new LinkedList<>();
    private final int n;

    public AverageSensor(SensorImpl implementor, int n) {
        super(implementor);
        this.n = n;
    }

    public double getAverageValue() {
        queue.add(implementor.getValue());
        if(queue.size()>n)
            queue.remove();

        return queue.stream().mapToDouble(a -> a).average().orElse(0);
    }
}
