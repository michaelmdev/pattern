package gof.structural.bridge.manufacture;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import gof.structural.bridge.platform.Machine;

import java.util.List;

public class PartitionOrderedManufacture extends OrderedManufacture
{
    int partitionSize;

    public PartitionOrderedManufacture(Machine machine, int partitionSize)
    {
        super(machine);
        this.partitionSize = partitionSize;
    }

    @Override
    public void execute(Order order)
    {
        String name = order.getName();

        List<Integer> list = Ints.asList(order.getLengths());
        List<List<Integer>> partitions = Lists.partition(list, partitionSize);

        for (int i = 0; i < partitions.size(); i++)
        {
            int[] part = Ints.toArray(partitions.get(i));
            cutSequence(getName(name,i), part);
        }
    }

    private String getName(String name, int i)
    {
        return name + i;
    }
}
