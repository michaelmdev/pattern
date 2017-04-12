package gof.behavioral.observer;

// интерфейс подписчика, определяет интерфейс реализуемый подписчиками
public interface Subscriber {
    // оповестить об изменениях у todo...
    void update(ISubject observable);
}
