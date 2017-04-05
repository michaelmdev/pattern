package gof.structural.composite;// program@globall.ru @ 04.04.2017.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperation implements Operation {

    private List<Operation> operations = new ArrayList<>();

    @Override
    public void perform() {
        System.out.printf("performing %s \n{\n",this.getClass().getSimpleName());
        for (Operation operation : operations) {
            operation.perform();
        }
        System.out.printf("}");
    }

    @Override
    public int getLeadTime() {
        int t = 0;
        for (Operation operation : operations) {
            t += operation.getLeadTime();
        }
        return t;
    }

    public Operation add(Operation... operations) {
        this.operations.addAll(Arrays.asList(operations));
        return this;
    }
}
