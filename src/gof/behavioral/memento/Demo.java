package gof.behavioral.memento;

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
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        DesignMenuBar menuBar = new DesignMenuBar();
        frame.setJMenuBar(menuBar);

        DesignPanel designPanel = new DesignPanel(frame);
        frame.add(designPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
