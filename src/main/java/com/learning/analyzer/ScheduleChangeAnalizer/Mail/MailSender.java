package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {

    public static void main(String[] args) {

        final String username = "cforemny@gmail.com";
        final String password = "tajnehaslo";

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
                    InternetAddress.parse("cforemny@gmail.com "));
            message.setSubject("Super wiadomosc od cypa");
            message.setText("Drogi Pawle!"
                    + "\n\n Pozdrowienia z javy");

            Transport.send(message);

            System.out.println("wyslane");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}