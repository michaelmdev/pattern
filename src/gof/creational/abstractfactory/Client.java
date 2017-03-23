package gof.creational.abstractfactory;

/**
 * @author michael.malevannyy@gmail.com, 22.03.2017
 */

public class Client {
    public void doSomeUseful(String name) {

        try {

            ExchangeFactory exchangeFactory = Fabric.getInstance().createFactory(name);
            PriceProvider priceProvider = exchangeFactory.createPriceProvider();
            DocProvider docProvider = exchangeFactory.createDocProvider();

            // do some useful ....

        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }


    }
}
