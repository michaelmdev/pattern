package gof.behavioral.caffe;

import java.util.ArrayList;
import java.util.List;

// абстрактный объект распространения информации
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    // подключить снаблюдателя
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // отклюючить наблюдателя
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // проинформировать подписантов об изменениях
    protected void notify(Object arg){
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}
