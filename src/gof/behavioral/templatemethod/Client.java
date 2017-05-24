package gof.behavioral.templatemethod;// program@globall.ru @ 24.05.2017.

public class Client {
    public NotificationChanel getNotificationChanel() {
        return new NotificationChanel(CommunicationType.EMAIL, "user@example.com");
    };
}
