package gof.behavioral.chain;

import java.util.logging.Logger;

/**
 * ведет лог всех звонков in/out/internal
 */

public class LogHandler extends Handler {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void handleEvent(Event event) {
        log.info(event.getData());
        super.handleEvent(event);
    }
}
