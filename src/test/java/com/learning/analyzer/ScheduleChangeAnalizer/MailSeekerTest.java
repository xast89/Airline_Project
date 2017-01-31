package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSeeker;
import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSpliter;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Matchers.any;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSeekerTest {

    @InjectMocks
    private MailSeeker mailSeeker;
    @Mock
    private MailSpliter mailSpliter;

    @Before
    public void setUp() {
        mailSeeker = new MailSeeker();

    }

    @Test
    public void findMailInPassengerInformation() {

        //given

        Booking booking = BookingFactory.createBookingForSCAnalyzer();
//        Passenger passengerInformation = booking.getPassengerList().get(any(Passenger.class)).getPassengerInformation();
        Mockito.when(mailSpliter.findMailInformatiom().thenReturn("cforemny@gmail.com");
        //when
        String result = mailSeeker.findMail(booking.getPassengerList().get(0));
        //then
        assertEquals("cforemny@gmail.com", result);
    }

}