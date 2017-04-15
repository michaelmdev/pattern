package gof.behavioral.chain;

/**
 * взаимодействует с CRM при ходящем взонке
 */

public class CrmHandler extends Handler {
    @Override
    public void handleEvent(Event event) {
        System.out.println("call CRM");
        super.handleEvent(event);
    }
}
