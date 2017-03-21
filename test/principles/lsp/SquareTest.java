package principles.lsp;

import principles.lsp.bad.Rectangle;
import principles.lsp.bad.Square;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

class SquareTest {
    @Test
    void testArea() {
        Rectangle rectangle = new Square();
        // нарушение приципа LSP, мы не ожидаем тут что и высота ТОЖЕ изменится
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        // тест провален, актуальное значение 16
        assert rectangle.getArea() == 20;
    }

    @Test
    void foo() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        assert (calendar1 != calendar2);

        calendar1.set(2017,01,01);
    }
}