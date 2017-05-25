package gof.behavioral.memento.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Frame implements Serializable {

    private final List<Beam> beams = new ArrayList<>();

    public List<Beam> getBeams() {
        return beams;
    }

    public void add(Beam beam) {

        // todo check beam points

        //
        if(beams.size()>0) {
            Beam last = beams.get(beams.size() - 1);
            last.endBeam = beam;
            beam.startBeam = last;

            Beam first = beams.get(0);
            first.startBeam = beam;
            beam.endBeam = first;
        }
        else  {
            beam.startBeam = beam;
            beam.endBeam = beam;
        }

        beams.add(beam);

        beam.id = beams.indexOf(beam);

    }
}
