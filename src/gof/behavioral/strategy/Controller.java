package gof.behavioral.strategy;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

public class Controller {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payOrder(Order order) {
        order.pay(paymentStrategy);
    }

    public void getPaymentCredinitials()
}
