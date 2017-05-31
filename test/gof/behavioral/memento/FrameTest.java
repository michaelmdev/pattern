package gof.behavioral.memento;

import com.google.gson.Gson;
import gof.behavioral.memento.model.Beam;
import gof.behavioral.memento.model.Frame;
import gof.behavioral.memento.model.Profile;
import org.junit.jupiter.api.Test;

import java.io.*;

class FrameTest {
    @Test
    void addTest() throws IOException, ClassNotFoundException {
        Gson gson = new Gson();

        Frame frame = new Frame();
        Profile profile = new Profile("name" , 10);

        for (int i = 0; i < 4; i++) {
            Beam beam = new Beam(null,null);
            beam.profile = profile;
            frame.add(beam);
        }

        // stack overflow exception - прчина циркулярный граф ссылок
        // String json = gson.toJson(frame);
        // System.out.println(json);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(frame);
        oos.flush();

        // 361 байт без указания профиля
        // 491 бай с указанием
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Frame frame1 = (Frame) ois.readObject();



    }

}