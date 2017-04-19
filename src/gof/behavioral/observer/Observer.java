package gof.behavioral.observer;

// интерфейс наблюдаетля
public interface Observer {
    void update(Subject subject, Object arg);
}
