package gof.structural.bridge.manufacture;// program@globall.ru @ 03.04.2017.

import gof.structural.bridge.platform.Machine;

import java.util.Arrays;

public class OrderedManufacture extends SequentialManufacture
{
    public OrderedManufacture(Machine machine)
    {
        super(machine);
    }

    @Override
    protected void cutSequence(String name, int[] lengths)
    {
        Arrays.sort(lengths);
        super.cutSequence(name, lengths);
    }
}
