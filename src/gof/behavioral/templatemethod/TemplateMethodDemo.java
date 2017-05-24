package gof.behavioral.templatemethod;// program@globall.ru @ 24.05.2017.

public class TemplateMethodDemo {
    public static void main(String[] args) {
        new TemplateMethodDemo().demo(new Client(), "subject", "perfect message");
    }

    private void demo(Client client, String subject, String message) {

        NotificationChanel chanel = client.getNotificationChanel();

        Notifier notifier = NotifierFabric.getNotifier(chanel.getCommunicationType());

        notifier.notify(chanel.getAddress(), subject, message);


    }
}
