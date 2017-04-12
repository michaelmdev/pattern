package gof.behavioral.caffe;

// интерфейс наблюдаетля
public interface Observer {
    void update(Subject subject, Object arg);
}
