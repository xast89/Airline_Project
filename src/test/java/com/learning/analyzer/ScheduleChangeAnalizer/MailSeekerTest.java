package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSeeker;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSeekerTest {

    @InjectMocks
    private MailSeeker mailSeeker;

    @Mock
    private Passenger passenger;

    @Before
    public void setUp() {
        mailSeeker = new MailSeeker();

    }

    @Test
    public void findMailInPassengerInformationWhenAdressIsCorrect() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();

        //when
        String result = mailSeeker.findMail(booking.getPassengerList().get(0));
        //then
        assertEquals("cforemny@gmail.com", result);
    }

    @Test
    public void findMailInPassengerInformationWhenAdressIsInCorrect() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        Mockito.when(passenger.getPassengerInformation()).thenReturn(asList("Incorrect", "Incorrect", "Incorrect"));

        //when
        String result = mailSeeker.findMail(passenger);
        //then
        assertEquals(null, result);
    }


}