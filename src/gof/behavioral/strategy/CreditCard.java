package gof.behavioral.strategy;

/**
 * @author michael.malevannyy@gmail.com, 23.05.2017
 */

public class CreditCard {
    private final String number;
    private final String cvv2;
    private final String cardHolder;
    private final String validThru;

    public CreditCard(String number, String cvv2, String cardHolder, String validThru) {
        this.number = number;
        this.cvv2 = cvv2;
        this.cardHolder = cardHolder;
        this.validThru = validThru;
    }

    public String getNumber() {
        return number;
    }

    public String getCvv2() {
        return cvv2;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getValidThru() {
        return validThru;
    }
}
