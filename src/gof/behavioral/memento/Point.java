package gof.behavioral.memento;


import java.io.Serializable;

public final class Point implements Serializable {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
