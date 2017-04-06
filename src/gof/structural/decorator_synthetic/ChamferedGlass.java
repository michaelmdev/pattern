package gof.structural.decorator_synthetic;

// со снятой фаской указанного размера
public class ChamferedGlass extends GlassDecorator {
    int chamfer;

    public ChamferedGlass(Glass decoratee, int chamfer) {
        super(decoratee);
        this.chamfer = chamfer;
    }

    @Override
    public void postprocess() {
        // базовый функционал
        super.postprocess();

        // доавляем функционал после базового
        System.out.printf(" фацет %d мм", chamfer);
    }
}
