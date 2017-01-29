package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.ageAnalizer.Date.PassengerBirthDayAnalizer;
import com.learning.analyzer.ageAnalizer.Date.PassportAnalizer;
import com.learning.analyzer.ageAnalizer.Segment.ActiveSegment;
import com.learning.analyzer.ageAnalizer.Segment.AgeAtSegment;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-24.
 */
public class PassengerBirthDayAnalizerTest {

    @InjectMocks
    private PassengerBirthDayAnalizer passengerBirthDayAnalizer;
    private Calendar calendar;


    @Mock
    private PassportAnalizer passportAnalizer;
    @Mock
    private ActiveSegment activeSegment;
    @Mock
    private AgeAtSegment ageAtSegment;
    @Mock
    private Segment segment;


    @Test
    public void testAnalyze() {
        //given
        Booking booking = BookingFactory.createOneAdultOneWay();
        calendar = new GregorianCalendar(2000, 10, 10);
        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        assertEquals(10, calendar.get(Calendar.MONTH));
    }

    @Test
    public void checkIfResultMapIsProperlyFilled() {
        //given
        Booking booking = BookingFactory.createOneAdultOneWay();
        calendar = new GregorianCalendar(2000, 10, 10);
        Mockito.when(activeSegment.findActiveSegment(any(Passenger.class))).thenReturn(segment);
        Mockito.when(passportAnalizer.getBirthDayFromPassport(any(Passenger.class))).thenReturn(calendar);
        Mockito.when(ageAtSegment.countDays(segment, calendar)).thenReturn(1000);
        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        assertEquals(2, booking.getPassengerList().get(0).getResultMap().get("Anal_1"));


    }


}