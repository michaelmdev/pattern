package gof.structural.decorator_realworld;// program@globall.ru @ 06.04.2017.

import gof.structural.composite.Operation;

import java.util.logging.Logger;

// этот деккоратор будет логировать выполняемые опреации, необходимые не всегда, а лишь при пуконаладке оборудования
public class LoggingOperation extends OperationDecorator {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public LoggingOperation(Operation decoratee) {
        super(decoratee);
    }

    // гарантированную базовую функциональность выполняет суперкласс, но мы можем переопредлить поведение
    @Override
    public void perform() {
        // добавленный функционал = логирование
        log.info(getExplanation());

        // базовый функционал
        super.perform();
    }
}
