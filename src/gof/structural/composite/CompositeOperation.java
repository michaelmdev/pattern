package gof.structural.composite;// program@globall.ru @ 04.04.2017.

import com.google.common.base.Joiner;

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
    public String getExplanation() {
        List<String> strings = new ArrayList<>();
        for (Operation operation : operations) {
            strings.add(operation.getExplanation());
        }
        return "[" + Joiner.on(',').join(strings) + "]";
    }

    public Operation add(Operation... operations) {
        this.operations.addAll(Arrays.asList(operations));
        return this;
    }
}
