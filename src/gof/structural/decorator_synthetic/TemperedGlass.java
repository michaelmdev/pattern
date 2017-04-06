package gof.structural.decorator_synthetic;

/**
 * @author michael.malevannyy@gmail.com, 06.04.2017
 */

public class TemperedGlass extends GlassDecorator {
    public TemperedGlass(Glass decoratee) {
        super(decoratee);
    }

    @Override
    public void postprocess() {
        // добаляем функционал до базового
        System.out.print("Закаленное ");

        // базовый функционал
        super.postprocess();
    }
}
