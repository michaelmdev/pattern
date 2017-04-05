package gof.structural.composite;// program@globall.ru @ 03.04.2017.

public class AtomicOperation implements Operation
{
    @Override
    public void perform(int x)
    {

    }

    @Override
    public void add(Operation... operations)
    {
        throw new IllegalArgumentException("can't add to base operation");
    }
}
