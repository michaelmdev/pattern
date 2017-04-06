package gof.structural.decorator_synthetic;

// базовый класс поведение которого может быть динамически расширено
public class PlainGlass implements Glass {
    String marking;

    public PlainGlass(String marking) {
        this.marking = marking;
    }

    @Override
    public void postprocess() {
        System.out.printf("Стекло %s", marking);
    }
}
