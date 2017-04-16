package gof.behavioral.chain;

public class Client {
    public static void main(String[] args) {

        Handler handler = new BusyHandler();

        handler.link(new Operator("#1"))
                .link(new Operator("#2"))
                .link(new Operator("#3"))
                .link(handler);

        // генерируем поток из 10 запросов
        for (int i = 0;i<10;i++) {
            final int temp = i;
            handler.handle(new Request() {
                @Override
                public String getData() {
                    return Integer.toString(temp);
                }
            });
        }

    }
}
