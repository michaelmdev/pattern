package gof.behavioral.chain;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        // создаём цепочку обработки, более важные впееред
        Handler handler = new LogHandler().link(new AnsweringMachineHandler()).link(new ExposeCall()).link(new CrmHandler());


        for (String s: Arrays.asList("1", "2", "3", "4")) {

            handler.handleEvent(new DemoEvent(s));

        }

    }
}
