package gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// издатель управляет подпииской
// оповещает подписчиков об изменеиях в наблядаемых ими объектах
public class Publisher {

    List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


}
