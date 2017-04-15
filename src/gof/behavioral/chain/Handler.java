package gof.behavioral.chain;

/**
 * абстрактный обработчик
 */

public abstract class Handler {
    private Handler next;

    public void handleEvent(Event event) {
        if(next != null)
            next.handleEvent(event);
    }

    Handler link(Handler next) {
        this.next = next;
        return next;
    }
}
