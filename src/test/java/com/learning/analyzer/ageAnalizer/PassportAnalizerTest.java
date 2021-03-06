package com.learning.analyzer.ageAnalizer;


import com.learning.analyzer.ageAnalizer.Date.PassportAnalizer;
import com.learning.factory.SegmentFactory;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.structure.util.AirportEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.*;


/**
 * Created by Cyprian on 2017-01-17.
 */
@RunWith(MockitoJUnitRunner.class)
public class PassportAnalizerTest {

    @InjectMocks
    private PassportAnalizer passportAnalizer;

    @Mock
    private BirthdayStringConverter birthdayStringConverter;
    @Mock
    private Passenger passenger;

    @Test
    public void testGetBirthDayFromPassport() {
        //given
        Calendar gregorianCalendar = new GregorianCalendar(1989, 7, 20);
        Mockito.when(passenger.getPassengerInformation()).thenReturn(passengerInformation());
        Mockito.when(birthdayStringConverter.convertPassengerBirthdayToInt(passenger.getPassengerInformation().get(1))).thenReturn(gregorianCalendar);
        //when
        Calendar result = passportAnalizer.getBirthDayFromPassport(passenger);
        //then
        assertEquals(gregorianCalendar, result);
    }

    @Test
    public void checkifPassengerBirthayisNotNull() {
        //given
        Calendar gregorianCalendar = new GregorianCalendar(1989, 7, 20);
        Mockito.when(passenger.getPassengerInformation()).thenReturn(passengerInformation());
        Mockito.when(birthdayStringConverter.convertPassengerBirthdayToInt(passenger.getPassengerInformation().get(1))).thenReturn(gregorianCalendar);
        //when
        Calendar result = passportAnalizer.getBirthDayFromPassport(passenger);
        //then
        assertFalse(result == null);
    }

    @Test
    public void checkifPassengerBirthayisNull() {
        //given
        Mockito.when(passenger.getPassengerInformation()).thenReturn(passengerInformation());
        Mockito.when(birthdayStringConverter.convertPassengerBirthdayToInt(passenger.getPassengerInformation().get(1))).thenReturn(null);
        //when
        Calendar result = passportAnalizer.getBirthDayFromPassport(passenger);
        //then
        assertTrue(result == null);
    }

    private List<String> passengerInformation() {
        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/DE/123WXY/20JUN89/XPD/20JAN20");
        return passengerInformation;
    }

    private List<Segment> segmentsInformation() {
        List<Segment> segments = Arrays.asList(SegmentFactory.oneWay(AirportEnum.BER, AirportEnum.KRK));
        return segments;
    }
}