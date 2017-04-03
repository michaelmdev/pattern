package gof.structural.bridge.manufacture;// program@globall.ru @ 03.04.2017.

import gof.structural.bridge.platform.Machine;

public class ParallelManufacture implements Manufacture
{
    Machine[] machines;

    public ParallelManufacture(Machine[] machines)
    {
        this.machines = machines;
    }

    @Override
    public void execute(Order order)
    {
        int[] lengths = order.getLengths();
        for (int i = 0; i < machines.length; i++)
        {
            machines[i].beginJob(order.getName());

            for (int j=i; j<lengths.length; j+=machines.length)
                machines[i].cut(lengths[j]);

            machines[i].commitJob();
        }
    }
}
