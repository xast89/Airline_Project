package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.ageAnalizer.Date.PassengerBirthDayAnalizer;
import com.learning.analyzer.ageAnalizer.Date.PassportAnalizer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Calendar;
import java.util.GregorianCalendar;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-24.
 */
public class PassengerBirthDayAnalizerTest {

    @InjectMocks
    private PassengerBirthDayAnalizer passengerBirthDayAnalizer;
    @Mock
    private Booking booking;
    @Mock
    private PassportAnalizer passportAnalizer;
    @Mock
    private Passenger passenger;
    @Mock
    Calendar calendar;

    @Before
    public void setUp() {
        passengerBirthDayAnalizer = new PassengerBirthDayAnalizer();
    }

    @Test
    public void testAnalyze() {
        //given
        calendar = new GregorianCalendar(2000, 10, 10);
        Mockito.when(passportAnalizer.getBirthDayFromPassport(passenger)).thenReturn(calendar);
        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        Assert.assertEquals(10,calendar.get(Calendar.MONTH));


    }


    @Test
    public void checkIfBirthdayFromPassportIsNull(){

        //given
        Mockito.when(passportAnalizer.getBirthDayFromPassport(passenger)).thenReturn(null);
        //when
        passengerBirthDayAnalizer.analyze(booking);
        //then
        Assert.assertEquals(0,calendar.get(Calendar.MONTH));


    }


}