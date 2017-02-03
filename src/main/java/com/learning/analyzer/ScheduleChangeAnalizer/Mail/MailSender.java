package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;


public class MailSender {

    public static void sendEmail() {

        final String username = "cforemny@gmail.com";
        final String password = "foremny22a";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cforemny@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("cforemny@gmail.com, zajac.aleksandraa@gmail.com "));
            message.setSubject("Lot odwolany");
            message.setText("Burza snieżna, nie ma latania");

            Transport.send(message);

            LOGGER.info("Wslalano maila");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}