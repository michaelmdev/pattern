package gof.behavioral.observer2;

// интерфейс подписчика, определяет интерфейс реализуемый подписчиками
public interface Subscriber {
    // оповестить об изменениях у todo...
    void update(ISubject observable);
}
