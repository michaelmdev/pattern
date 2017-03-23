package gof.creational.abstractfactory.ulmart;

import gof.Doc;
import gof.Payment;
import gof.creational.abstractfactory.DocProvider;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 */

public class UlmartDocProvider implements DocProvider {
    @Override
    public Doc getDoc(int id) {
        return null;
    }

    @Override
    public void sendPayment(Payment payment) {

    }
}
