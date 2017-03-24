package gof.creational.builder;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 */

public class Client {
    public void sendMail(Session session) throws MessagingException {
        MimeMessage message = (new MimeMessageBuilder(session)).from("from@example.com").to("to@example.com").subject("hello").build();
        // send it
        Transport.send(message);
    }
}
