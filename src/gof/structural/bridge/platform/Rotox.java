package gof.structural.bridge.platform;

/**
 * @author michael.malevannyy@gmail.com, 03.04.2017
 */

public class Rotox implements Machine {
    @Override
    public void beginJob(String name) {
        // do open concrete machine commands file
    }

    @Override
    public void cut(int len) {
        // place a piece cutting here
    }

    @Override
    public void commitJob() {
        // close file
    }

}
