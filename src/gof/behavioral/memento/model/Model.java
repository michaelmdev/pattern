package gof.behavioral.memento.model;

/**
 * Created by program on 30.05.2017.
 */
public class Model {
    private final Frame frame;

    public Model() {
        this.frame = new Frame();
    }

    public Frame getFrame() {
        return frame;
    }
}
