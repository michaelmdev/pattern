package gof.structural.bridge.manufacture;// program@globall.ru @ 03.04.2017.

import gof.structural.bridge.platform.Machine;

abstract class SimpleManufacture implements Manufacture
{
    protected Machine machine;

    public SimpleManufacture(Machine machine)
    {
        this.machine = machine;
    }
}
