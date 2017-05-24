package gof.behavioral.memento;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class FrameTest {
    @Test
    void addTest() throws IOException {

        Frame frame =  new Frame();

        frame.add(new Beam());
        frame.add(new Beam());
        frame.add(new Beam());
        frame.add(new Beam());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(frame);




    }

}