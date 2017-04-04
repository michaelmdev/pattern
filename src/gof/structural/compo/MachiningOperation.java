package gof.structural.compo;// program@globall.ru @ 04.04.2017.

public class MachiningOperation implements Operation
{
    private String name;

    public MachiningOperation(String name)
    {
        this.name = name;
    }

    @Override
    public void perform(int x)
    {
        System.out.printf("%s @ %s\n", name,x);
    }
}
