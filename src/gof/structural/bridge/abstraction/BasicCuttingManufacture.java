package gof.structural.bridge.abstraction;

import gof.structural.bridge.platform.CuttingMachine;

/**
 * @author michael.malevannyy@gmail.com, 03.04.2017
 */

public class BasicCuttingManufacture implements Manufacture {
    private CuttingMachine machine;

    public BasicCuttingManufacture(CuttingMachine machine) {
        this.machine = machine;
    }

    public void execute(Order order) {
        machine.beginJob();
        cut(order.getLengths());
        machine.commitJob();
    }

    protected void cut(int[] lengths) {
        for (int len : lengths) {
            machine.cut(len);
        }
    }
}
