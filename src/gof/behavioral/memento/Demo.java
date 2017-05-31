package gof.behavioral.memento;

import gof.behavioral.memento.model.*;
import gof.behavioral.memento.model.Frame;
import gof.behavioral.memento.model.Point;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SimpleLog;

import javax.swing.*;
import java.awt.*;

/**
 * @author michael.malevannyy@gmail.com, 26.05.2017
 */

public class Demo {
    Log log = new SimpleLog(Demo.class.getSimpleName());

    public static void main(String... args) {
        new Demo().run();

    }

    private void run() {

        Model model = newModel();

        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        DesignMenuBar menuBar = new DesignMenuBar();
        frame.setJMenuBar(menuBar);

        DesignPanel designPanel = new DesignPanel(frame, model);
        frame.add(designPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private Model newModel() {
        Model model = new Model();
        Frame frame = model.getFrame();
        gof.behavioral.memento.model.Point[] p = new Point[4];
        p[0] = new Point(100,100);
        p[1] = new Point(200,100);
        p[1] = new Point(200,200);
        p[1] = new Point(100,200);

        frame.add(new Beam(p[0],p[1]));
        frame.add(new Beam(p[1],p[2]));
        frame.add(new Beam(p[2],p[3]));
        frame.add(new Beam(p[3],p[0]));

        return model;
    }
}
