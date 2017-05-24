package gof.behavioral.templatemethod;// program@globall.ru @ 24.05.2017.

public class FacebookNotifier extends Notifier {
    @Override
    protected void login() {
        // login to facebook
    }

    @Override
    protected void send(String address, String subject, String message) {
        // send facebook message
    }

    @Override
    protected void logout() {
        // logout from facebook
    }

    @Override
    protected void log(String address, String subject, String message) {
        // не будем внутренне логировать нотификацию по FB, ибо это избыточно
    }
}
