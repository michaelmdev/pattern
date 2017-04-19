package gof.behavioral.observer;

// индикатор температуры,
// показывает температуру при получении сообщения,
// типичный push-клиент, получает температуру как payload вызоыа update()
public class DisplayObserver implements Observer {
    @Override
    public void update(Subject subject, Object arg) {
        System.out.printf("%s temperature %s\n", subject.toString(), arg);
    }
}
