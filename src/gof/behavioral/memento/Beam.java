package gof.behavioral.memento;

import java.io.Serializable;

// немного чудаковатая унаследованная модель AS IS
public class Beam implements Serializable {
    int id;

//    Point start;
//    Point end;

    Profile profile;

    Beam startBeam;
    Beam endBeam;

}
