package gof.behavioral.memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author michael.malevannyy@gmail.com, 26.05.2017
 */

public class DesignPanel extends JPanel {
    public DesignPanel() {

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JTextField field = new JTextField("input");

                field

                DesignPanel.this.add(field);

                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fill3DRect(10,10, 100, 50, true);
        g.setColor(Color.RED);
        g.fillOval(100, 100, 30, 30);
    }

}
