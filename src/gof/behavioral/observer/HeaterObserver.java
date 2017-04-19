package gof.behavioral.observer;

// нагреватель поднимает температуру на step градусов
// типичный pull-клиент, не обращает вниямения на payload
// ссотояние получает и модифицирует вызом методов наблюдаемого объекта
public class HeaterObserver implements Observer {
    private final int lowThreshold;
    private final int highThreshold;
    private final int step;

    public HeaterObserver(int lowThreshold, int highThreshold, int step) {
        this.lowThreshold = lowThreshold;
        this.highThreshold = highThreshold;
        this.step = step;
    }

    @Override
    public void update(Subject subject, Object arg) {
        if(subject instanceof Sensor) {
            Sensor sensor = (Sensor) subject;

            int t = sensor.getT();
            int delta = t-lowThreshold;
            if(delta < 0) {
                t+= step;
                System.out.printf("++ heat impulse +%d\n", step);
                sensor.setT(t);
            }
        }
    }
}
