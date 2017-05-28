package gof.behavioral.memento;

import javax.swing.*;

public class DesignMenuBar extends JMenuBar {
    public DesignMenuBar() {
        final JMenu fileMenu = new JMenu("File");
        final JMenu editMenu = new JMenu("Edit");

        this.add(fileMenu);
        this.add(editMenu);


        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> {

        });


        fileMenu.add(newMenuItem);

    }
}
