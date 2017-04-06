package gof.structural.decorator_realworld;// program@globall.ru @ 04.04.2017.

import gof.structural.composite.CompositeOperation;
import gof.structural.composite.MachiningOperation;
import gof.structural.composite.Operation;

public class Client
{
    public void demo() {
        // инициализация опреаций
        Operation drill6 = new MachiningOperation("отверстие 6 мм");
        Operation drill5 = new MachiningOperation("отверстие 5 мм");
        Operation screw6 = new MachiningOperation("нарезать резьбу M6");
        Operation chamfer10 = new MachiningOperation("снять фаску 10мм");
        Operation m6composite = new CompositeOperation().add(drill5,screw6,chamfer10);

        new LoggingOperation(m6composite).perform();
    }
}
