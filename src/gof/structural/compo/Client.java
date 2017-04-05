package gof.structural.compo;// program@globall.ru @ 04.04.2017.

public class Client
{
    public void operationsDemo() {
        // prepare
        Operation d6 = new MachiningOperation("drill D6");
        Operation d10 = new MachiningOperation("drill D10");
        Operation fask16 = new MachiningOperation("fask 16");

        Operation keyHole = new MachiningOperation("drill keyHole");

        Operation simpleHandle = new CompositeOperation("simple handle").add() ;

        Operation handleWithKey= new CompositeOperation("handle with key");


        // use
        simpleHandle.perform(500);
        handleWithKey.perform(1000);
    }
}
