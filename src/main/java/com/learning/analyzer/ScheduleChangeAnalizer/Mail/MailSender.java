package com.learning.analyzer.ScheduleChangeAnalizer.Mail;


import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.MessageCreator;
import com.learning.structure.booking.Booking;
import org.apache.log4j.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class MailSender {

    private Logger logger = Logger.getLogger(MailSender.class);
    private MessageCreator messageCreator;


    public MailSender() {
        this.messageCreator = new MessageCreator();

    }
    public void preapreAndSendEmailToAllPassangersFromCanceledSegment(Booking booking) {
        final String username = "cforemny@gmail.com";
        final String password = "foremny22a";

        Properties props = getProperties();

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            EmailListAsString emailListAsString = new EmailListAsString();
            String adresses = emailListAsString.createAdresses(booking);

            String messageAboutCanceledFlight = messageCreator.createMessageAboutCanceledFlight(booking.getPassengerList().get(0).getSegmentList());
            String messageAboutNewFlight = messageCreator.createMessageAboutNewFlight(booking.getPassengerList().get(0).getSegmentList());

            if (messageAboutCanceledFlight!=null && messageAboutNewFlight!=null) {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("cforemny@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(adresses));
                message.setSubject("Lot odwolany");
                message.setText(messageAboutCanceledFlight + messageAboutNewFlight);

//            Transport.send(message);

                logger.info("Wyslano maila");
            } else
                logger.info("Nie wyslano maila, brak danych.");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private Properties getProperties() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        return props;
    }


}