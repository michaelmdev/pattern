package gof.structural.composite;// program@globall.ru @ 04.04.2017.

public interface Operation
{
    // определяем наиболее общие операции для иерархии

    // выполнить одиночную или композитную операцию
    void perform();

    // получить время выполнения
    int getLeadTime();
}
