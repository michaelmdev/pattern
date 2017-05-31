package gof.behavioral.memento.model;

import java.io.Serializable;

// немного чудаковатая унаследованная модель AS IS
public class Beam implements Serializable {
    int id;

    public Point start;
    public Point end;

    public Profile profile;

    public Beam startBeam;
    public Beam endBeam;

    public Beam(Point start, Point end) {
        this.start = start;
        this.end  = end;
    }
}
