package gof.structural.bridge.manufacture;

import gof.structural.bridge.platform.Machine;

/**
 * @author michael.malevannyy@gmail.com, 03.04.2017
 */

public class SequentialManufacture extends SimpleManufacture
{
    public SequentialManufacture(Machine machine)
    {
        super(machine);
    }

    @Override
    public void execute(Order order)
    {
        cutSequence(order.getName(), order.getLengths());
    }

    protected void cutSequence(String name, int[] lengths)
    {
        machine.beginJob(name);
        for (int len : lengths)
            machine.cut(len);
        machine.commitJob();
    }
}
