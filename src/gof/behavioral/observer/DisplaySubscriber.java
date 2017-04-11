package gof.behavioral.observer;

/**
 * @author michael.malevannyy@gmail.com, 11.04.2017
 */

public class DisplaySubscriber implements Subscriber {
    @Override
    public void update(IObservable observable) {
        System.out.println(observable);
    }
}
