package gof.structural.composite;// program@globall.ru @ 04.04.2017.

// определяем наиболее общие операции для иерархии
public interface Operation {
    // выполнить одиночную или композитную операцию
    void perform();

    // броузер структуры
    String getExplanation();
}
