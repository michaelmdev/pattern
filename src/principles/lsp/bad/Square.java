package principles.lsp.bad;

/**
 * @author michael.malevannyy@gmail.com, 11.03.2017
 */

// Квадрат
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
