package gof.structural.bridge;

import gof.structural.bridge.manufacture.Manufacture;
import gof.structural.bridge.manufacture.Order;
import gof.structural.bridge.manufacture.ParallelManufacture;
import gof.structural.bridge.manufacture.SequentialManufacture;
import gof.structural.bridge.platform.Machine;
import gof.structural.bridge.platform.Rotox;
import gof.structural.bridge.platform.Scarabeo;

public class Client
{
    public void doParallel(Order order)
    {
        Manufacture manufacture = new ParallelManufacture(new Machine[]{new Rotox(), new Rotox(), new Scarabeo()});
        manufacture.execute(order);
    }

    public void doSequental(Order order)
    {
        Manufacture manufacture = new SequentialManufacture(new Rotox());
        manufacture.execute(order);
    }
}
