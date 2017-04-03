package gof.structural.bridge.manufacture;

import gof.structural.bridge.platform.Rotox;
import org.junit.jupiter.api.Test;

public class PartitionOrderedManufactureTest
{
    @Test
    public void testGetParts()
    {
        PartitionOrderedManufacture manufacture  = new PartitionOrderedManufacture(new Rotox(), 3);

        Order order = new Order()
        {
            @Override
            public String getName()
            {
                return "test";
            }

            @Override
            public int[] getLengths()
            {
                return new int[]{0,1, 2, 3, 4, 5, 6, 7, 8, 9};
            }
        };

        manufacture.execute(order);
    }


}