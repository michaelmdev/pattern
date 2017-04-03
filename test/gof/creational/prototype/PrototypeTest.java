package gof.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author michael.malevannyy@gmail.com, 26.03.2017
 */

class PrototypeTest implements Cloneable {

    int i;

    @Test
    public void foo()
    {
        PrototypeTest clone = null;

        try {
            clone = (PrototypeTest) this.clone();

            assert (clone != this);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        assert (clone != this);
    }

}