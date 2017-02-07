package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-02-06.
 */
public class MailSenderTest {

    @InjectMocks
    private MailSender mailSender;

    @Mock
    private Logger logger;

    @Test
    public void sendEmailFromRealBooking() {

        //given
        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        //when
        mailSender.sendEmail(bookingForSCAnalyzer);
        //then
        Mockito.verify(logger).info("Wyslano maila");
    }

}