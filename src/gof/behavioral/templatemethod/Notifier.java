package gof.behavioral.templatemethod;// program@globall.ru @ 24.05.2017.

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

public abstract class Notifier {

    static Log log =new Log4JLogger(Notifier.class.getName());

    public void notify(String address, String subject, String message) {
        login();
        send(address, subject, message);
        logout();
        log(address, subject, message);
    }

    // войти в ситему доставки сообщений
    protected abstract void login();

    // отправка сообщения
    protected abstract void send(String address, String subject, String message);

    // выход
    protected abstract void logout();

    // внутреннее логирование
    protected void log(String address, String subject, String message) {
        // логируем отправку
        log.info(...);
    }
}
