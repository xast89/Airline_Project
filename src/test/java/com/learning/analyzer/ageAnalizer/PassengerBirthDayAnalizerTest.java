package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.ageAnalizer.Date.PassengerBirthDayAnalizer;
import com.learning.analyzer.ageAnalizer.Date.PassportAnalizer;
import com.learning.analyzer.ageAnalizer.Segment.ActiveSegment;
import com.learning.analyzer.ageAnalizer.Segment.AgeAtSegment;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.structure.util.FlightStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-24.
 */
public class PassengerBirthDayAnalizerTest {

    @InjectMocks
    private PassengerBirthDayAnalizer passengerBirthDayAnalizer;
    @Mock
    private PassportAnalizer passportAnalizer;
    @Mock
    private Passenger passenger;
    @Mock
    private Calendar calendar;
    @Mock
    private ActiveSegment activeSegment;
    @Mock
    private AgeAtSegment ageAtSegment;
    @Mock
    private Segment segment;

    @Before
    public void setUp() {
        passengerBirthDayAnalizer = new PassengerBirthDayAnalizer();

    }

    @Test
    public void testAnalyze() {
        //given
        Booking booking = BookingFactory.createOneAdultOneWay();
        calendar = new GregorianCalendar(2000, 10, 10);
        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        assertEquals(10,calendar.get(Calendar.MONTH));


    }
    @Test
    public void checkIfResultMapIsProperlyFilled(){
        //given
        Booking booking = BookingFactory.createOneAdultOneWay();
        calendar = new GregorianCalendar(2000, 10, 10);
        Mockito.when(activeSegment.findActiveSegment(booking.getPassengerList().get(0))).thenReturn(segment);
        Mockito.when(passportAnalizer.getBirthDayFromPassport(any(Passenger.class))).thenReturn(calendar);
        Mockito.when(ageAtSegment.countDays(booking.getPassengerList().get(0).getSegmentList().get(0), calendar)).thenReturn(1000);

        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        assertEquals(2,booking.getPassengerList().get(0).getResultMap().get("Anal_1"));


    }


    @Test
    public void checkIfBirthdayFromPassportIsNull(){

        //given
        Booking booking = BookingFactory.createOneAdultOneWay();
        Mockito.when(passportAnalizer.getBirthDayFromPassport(passenger)).thenReturn(null);
        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        assertEquals(0,calendar.get(Calendar.MONTH));


    }


}