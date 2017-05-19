package enterprise.valueobject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

;

/**
 * @author michael.malevannyy@gmail.com, 19.05.2017
 */

class PointTest {

    @Test
    public void pointTest() {
        assertEquals (new Point(1,2) , new Point(1,2));
    }

}