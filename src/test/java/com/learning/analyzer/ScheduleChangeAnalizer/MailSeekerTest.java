package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSeeker;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSeekerTest {

    private MailSeeker mailSeeker;


    @Before
    public void setUp(){
        mailSeeker = new MailSeeker();

    }

    @Test
    public void findMailInPassengerInformation(){

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        String result = mailSeeker.findMail(booking.getPassengerList().get(0));
        //then
        assertEquals("cforemny@gmail.com",result);
    }

}