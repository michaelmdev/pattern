package gof.structural.bridge.platform;

/**
 * @author michael.malevannyy@gmail.com, 03.04.2017
 */

public class Scarabeo implements Machine {
    @Override
    public void beginJob(String name) {
        // open TCP port
    }

    @Override
    public void cut(int len) {
        // send data
    }

    @Override
    public void commitJob() {
        // close port
    }
}
