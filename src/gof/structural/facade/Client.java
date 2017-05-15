package gof.structural.facade;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author michael.malevannyy@gmail.com, 12.05.2017
 */

public class Client {
    public static void main(String[] args) throws IOException {

        ConsoleFacade facade = new ConsoleFacade();

        System.out.printf("string >");
        String s = facade.getString();
        System.out.println(s);

        System.out.printf("int >");
        int n = facade.getInt();
        System.out.println(n);

        System.out.printf("ip >");
        InetAddress ip = facade.getIp();
        System.out.println(ip);
    }
}
