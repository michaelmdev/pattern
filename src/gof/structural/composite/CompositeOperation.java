package gof.structural.composite;// program@globall.ru @ 03.04.2017.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperation implements Operation
{
    List<Operation> suboperations = new ArrayList<>();

    @Override
    public void perform(int x)
    {
        for (Operation operation : suboperations)
        {
            operation.perform();
        }
    }

    @Override
    public void add(Operation... operations)
    {
        suboperations.addAll(Arrays.asList(operations));
    }
}
