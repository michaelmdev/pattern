package gof.behavioral.chain;

/**
 * отображает завонок
 */

public class ExposeCall extends Handler {
    @Override
    public void handleEvent(Event event) {
        System.out.println(event.getData());
        super.handleEvent(event);
    }
}
