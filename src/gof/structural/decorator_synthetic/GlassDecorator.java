package gof.structural.decorator_synthetic;

// абстрактный декоратор, все потомки используют ссылку на декорируемый объект и указанный здесь конструктор
public abstract class GlassDecorator implements Glass {
    // декорируемый объект
    private Glass decoratee;

    // стан
    public GlassDecorator(Glass decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void postprocess() {
        decoratee.postprocess();
    }
}
