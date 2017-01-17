package com.learning.analyzer.ageAnalizer;

import com.learning.factory.SegmentFactory;
import com.learning.factory.TicketFactory;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.structure.util.AirportEnum;
import com.learning.structure.util.PassengerType;
import junit.framework.TestCase;
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


/**
 * Created by Cyprian on 2017-01-17.
 */
@RunWith(MockitoJUnitRunner.class)
public class PassportAnalizerTest extends TestCase {

    @InjectMocks
    private PassportAnalizer passportAnalizer;

    @Mock
    private BirthdayStringConverter birthdayStringConverter;
    private Passenger passenger;

    @Test
    public void testGetBirthDayFromPassport() {

        //given
        //passenger = new Passenger("Mietek", "Kowalski", PassengerType.ADULT, createPassengerSegmentList(), createPassengerInformationList(), TicketFactory.createTicket(true));

       Mockito.when(passenger.getPassengerInformation()).thenReturn(createPassengerInformationList());
        Mockito.when(BirthdayStringConverter.convertPassengerBirthdayToInt(passenger.getPassengerInformation().get(1))).thenReturn(new GregorianCalendar(2000, 7, 15));
        GregorianCalendar passengerGregorianCalendar = new GregorianCalendar(1989, 7, 20);
        //when
        Calendar result = PassportAnalizer.getBirthDayFromPassport(passenger);
        //then
        assertTrue(result.equals(passengerGregorianCalendar));

    }

    private List<String> createPassengerInformationList() {

        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/PL/123WXY/20JUL89/XPD/20JAN20");

        return passengerInformation;
    }

    private List<Segment> createPassengerSegmentList() {

        List<Segment> segments = Arrays.asList(SegmentFactory.oneWay(AirportEnum.GDN, AirportEnum.KRK));

        return segments;
    }

}