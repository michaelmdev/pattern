package gof.creational.abstractfactory;

import gof.Doc;
import gof.Payment;

/**
 * @author michael.malevannyy@gmail.com, 23.03.2017
 */

public interface DocProvider {
    Doc getDoc(int id);
    void sendPayment(Payment payment);
}
