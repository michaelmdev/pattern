package gof.structural.facade;

/**
 * @author michael.malevannyy@gmail.com, 12.05.2017
 */

public class ConsoleException extends RuntimeException {
    public ConsoleException(Exception e) {
        super(e.toString());
    }
}
