package gof.behavioral.caffe;

// демо
public class Client {
    public static void main(String arg[]) throws InterruptedException {

        Sensor sensor = new Sensor();

        // подключаем наблюдателей зв сенсором
        sensor.attach(new DisplayObserver());
        sensor.attach(new HeaterObserver(40, 100, 25));

        // начальное значение
        sensor.setT(20);

        // цикл энтропии - естественное охлаждение сенсора
        for (; ; ) {

            int random = (int) (Math.random() * 10);
            sensor.setT(sensor.getT() - random);

            Thread.sleep(500);
        }
    }
}
