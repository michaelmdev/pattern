package gof.structural.composite;// program@globall.ru @ 04.04.2017.

// минимальная опреация машинной обработки
public class MachiningOperation implements Operation
{
    private String name;

    public MachiningOperation(String name)
    {
        this.name = name;
    }

    @Override
    public void perform()
    {
        System.out.println(name);
    }

    @Override
    public String getExplanation() {
        return name;
    }

}
