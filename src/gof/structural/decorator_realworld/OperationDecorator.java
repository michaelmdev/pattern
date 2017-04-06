package gof.structural.decorator_realworld;// program@globall.ru @ 06.04.2017.

import gof.structural.composite.Operation;

// динамически расширяем функционал из примера паттерна Composite
// наследуем абстрактный декоратор от общего интерфейса Опреаций
public abstract class OperationDecorator implements Operation {
    // декорируемый объект
    Operation decoratee;

    // конструктор по умолчанию для всех конкретных декораторов потомков, аргументом всегда идет декорируемый объект
    public OperationDecorator(Operation decoratee) {
        this.decoratee = decoratee;
    }

    // вызываем базовую функциональность декорируемого объекта
    @Override
    public void perform() {
        decoratee.perform();
    }

    @Override
    public String getExplanation() {
        return decoratee.getExplanation();
    }
}
