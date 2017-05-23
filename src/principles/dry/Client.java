package principles.dry;

/**
 * @author michael.malevannyy@gmail.com, 22.05.2017
 */

public class Client {
    public static void main(String[] arg) {
        new Client().run(5);
    }

    private void run(int n) {
        foo(n);
        bar(n);
    }

    private void foo(int n) {
        System.out.println(n);
    }

    private void bar(int n) {
        System.out.println(n);
    }
}
