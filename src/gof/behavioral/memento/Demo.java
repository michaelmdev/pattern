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
        EventQueue.invokeLater(() -> {
//            try {
//                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            }
//            catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//                log.error(ex);
//            }

            JFrame frame = new JFrame("Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.add(new TestPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
