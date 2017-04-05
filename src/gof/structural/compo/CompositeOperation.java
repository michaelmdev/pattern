package gof.structural.compo;// program@globall.ru @ 04.04.2017.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperation implements Operation {
    private String description;

    private List<Operation> operations = new ArrayList<>();

    public CompositeOperation(String description) {
        this.description = description;
    }

    @Override
    public void perform(int x) {
        System.out.printf("performing %s\n", description);
        for (Operation operation : operations) {
            operation.perform(x);
        }
    }

    public void add(Operation... operations) {
        this.operations.addAll(Arrays.asList(operations));
    }
}
