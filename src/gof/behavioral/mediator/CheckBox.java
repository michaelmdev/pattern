package gof.behavioral.mediator;

import javax.swing.*;

/**
 * @author michael.malevannyy@gmail.com, 14.04.2017
 */

public class CheckBox extends JCheckBox implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
