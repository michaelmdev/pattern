package gof.structural.facade;

/**
 * @author michael.malevannyy@gmail.com, 12.05.2017
 */

public class Client {
    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();

        System.out.printf("вовд строки:");
        String s = reader.readString();

        System.out.printf("%s \n",s);


        System.out.printf("вовд целого:");
        int n = reader.readInt();

        System.out.printf("%d \n",s);
    }
}
