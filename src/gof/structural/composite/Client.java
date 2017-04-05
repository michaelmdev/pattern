package gof.structural.composite;// program@globall.ru @ 04.04.2017.

public class Client
{
    public void demo() {
        // инициализация опреаций
        Operation drill6 = new MachiningOperation("отверстие 6 мм");
        Operation drill5 = new MachiningOperation("отверстие 5 мм");
        Operation screw6 = new MachiningOperation("нарезать резьбу M6");
        Operation fask10 = new MachiningOperation("снять фаску 10мм");
        Operation m6composite = new CompositeOperation().add(drill5,screw6,fask10);

        // использование разных по структуре операций идентично
        drill6.perform();
        m6composite.perform();
    }
}
