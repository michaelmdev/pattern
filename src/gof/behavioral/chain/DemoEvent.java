package gof.behavioral.chain;

/**
 * @author michael.malevannyy@gmail.com, 15.04.2017
 */

public class DemoEvent implements Event {
    private String data;

    public DemoEvent(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
