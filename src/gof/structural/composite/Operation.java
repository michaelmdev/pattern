package gof.structural.composite;// program@globall.ru @ 03.04.2017.

public interface Operation
{
    // выполнить операцию по указанной координате
    void perform(int x);

    // добавить под операции
    void add(Operation... operations);
}
