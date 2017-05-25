package gof.behavioral.memento.model;

import java.io.Serializable;

// немного чудаковатая унаследованная модель AS IS
public class Beam implements Serializable {
    int id;

//    Point start;
//    Point end;

    public Profile profile;

    Beam startBeam;
    Beam endBeam;

}
