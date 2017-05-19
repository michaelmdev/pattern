package enterprise.unitofwork;

import java.util.Currency;
import java.util.Locale;

/**
 * @author michael.malevannyy@gmail.com, 17.05.2017
 */

public class Client {


    public static void main(String arg[]) {
        new Client().run();

    }

    private void run() {
        Currency usd = Currency.getInstance(Locale.US);

        Money usd5 = new Money(usd, 5);



    }
}
