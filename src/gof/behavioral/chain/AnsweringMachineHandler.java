package gof.behavioral.chain;

/**
 * автоответчик, может завершить обработку на себе, не передавая далее по цепочке
 */

public class AnsweringMachineHandler extends Handler {
    @Override
    public void handleEvent(Event event) {
        if (isAfterHours()) {
            System.out.println("оставте собщение после сигнала");
        }
        else {
            super.handleEvent(event);
        }
    }

    private boolean isAfterHours() {
        return false;
    }
}
