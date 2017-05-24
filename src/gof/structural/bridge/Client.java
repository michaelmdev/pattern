package gof.structural.bridge;// program@globall.ru @ 10.05.2017.

public class Client {
    public static void main(String arg[]) {

        Speedometer speedometer = new Speedometer();
        Accelerometer accelerometer = new Accelerometer();

        measure(speedometer);
        measure(accelerometer);
    }

    private static void measure(SensorImpl sensor) {
        System.out.println(sensor.getClass().getSimpleName());

        BaseSensor baseSensor = new BaseSensor(sensor);
        AverageSensor averageSensor = new AverageSensor(sensor, 5);

        for (int i = 0; i < 10; i++) {
            System.out.printf("мгновенное значение : %f, среднее значение: %f \n", baseSensor.getValue(), averageSensor.getAverageValue());
        }

    }
}
