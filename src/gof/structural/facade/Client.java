package gof.structural.facade;

import java.io.IOException;

/**
 * @author michael.malevannyy@gmail.com, 12.05.2017
 */

public class Client {
    public static void main(String[] args) throws IOException {

        ConsoleFacade facade = new ConsoleFacade();

        String s = facade.getString("введтите строку", "default");

        System.out.printf("%s \n", s);


        int n = facade.getInt("ввдите номер", 6);

        System.out.printf("%d \n", n);
    }
}
