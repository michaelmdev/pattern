package gof.behavioral.templatemethod;// program@globall.ru @ 24.05.2017.

public class EmailNotifier extends Notifier {
    private String mailFrom;

    @Override
    protected void login() {
        // no need to login or logout
    }

    @Override
    protected void send(String mailTo, String subject, String message) {
        // .. sendmail(mailFrom, mailTo, subject, message);
    }

    @Override
    protected void logout() {
        // no need to login or logout
    }
}
