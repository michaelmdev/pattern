package gof.behavioral.observer;

// конкретный субъект
// нотифицирует, своих подписантов при возникновении изменений в его состоянии
public class Sensor extends Subject {
    private int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
        notify(t);
    }
}
