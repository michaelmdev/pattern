package gof.structural.decorator;

// абстрактный декоратор, все потомки используют ссылку на декорируемый объект и указанный здесь конструктор
public abstract class GlassDecorator implements Glass {
    // декорируемый объект
    private Glass decoratee;

    public GlassDecorator(Glass decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void postprocess() {
        decoratee.postprocess();
    }
}
