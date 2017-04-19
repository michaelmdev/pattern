package gof.behavioral.observer2;

/**
 * @author michael.malevannyy@gmail.com, 11.04.2017
 */

public class EmailSubscriber implements Subscriber {
    @Override
    public void update(ISubject observable) {
        System.out.printf("senf email %s\n", observable.toString());
    }
}
