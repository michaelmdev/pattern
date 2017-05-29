package gof.behavioral.memento;

import gof.behavioral.memento.model.*;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DesignPanel extends JPanel {
    private final JFrame frame;
    private Model model;
    private final java.util.List<Point> trackPoints = new ArrayList<>();
    private final InnerMouseAdapter mouseAdapter;

    public DesignPanel(JFrame frame, Model model) {

        this.frame = frame;
        this.model = model;

        // контроллер
        mouseAdapter = new InnerMouseAdapter();

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }

    private void addTrackPoint(Point point) {
        trackPoints.add(point);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    // view, оно привязано к swing-у через зависимость от Graphics,
    // потенциально Graphics можно использовать для сохренения иконок конструкций
    // походу оно может сэйвиться в какойнить графический формат
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw tracks
        for (Point point : trackPoints) {
            g.drawRect(point.x, point.y, 1, 1);
        }

        // draw main model in black for example
        drawModel(model);

        // draw preview in inverse color if preview model exists
        // invertColor();
        if (mouseAdapter.getPreviewModel() != null) {
            drawModel(mouseAdapter.getPreviewModel());
        }
    }

    private void drawModel(Model model) {

        gof.behavioral.memento.model.Frame frame = model.getFrame();
        for (Beam beam : frame.getBeams()) {

        }

    }

    // контроллер
    private class InnerMouseAdapter extends MouseInputAdapter implements KeyListener{
        MouseEvent event;
        private Model previewModel = null;

        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            if(true){
                event = e;

            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);

            DesignPanel.this.addTrackPoint(e.getPoint());
            DesignPanel.this.repaint();
            DesignPanel.this.revalidate();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            //JOptionPane.showMessageDialog(null, "*");
            event=null;
        }

        public Model getPreviewModel() {
            return previewModel;
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
