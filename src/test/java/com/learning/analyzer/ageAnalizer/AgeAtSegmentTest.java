package com.learning.analyzer.ageAnalizer;

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

import java.util.Arrays;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;


/**
 * Created by Cyprian on 2017-01-19.
 */
@RunWith(MockitoJUnitRunner.class)
public class AgeAtSegmentTest {

    @InjectMocks
    private AgeAtSegment ageAtSegment;

    @Mock
    private Passenger passenger;
    @Mock
    private Calendar calendar;
    @Mock
    private Segment segment;
    @Mock
    private Calendar departureDay;

    @Before
    public void setUp() {
        this.ageAtSegment = new AgeAtSegment();

    }


    @Test
    public void testCheckAgeAtSegments() {

        //given
       // Mockito.when(segment.getFlightStatus()).thenReturn(FlightStatus.ACTIVE);
        Mockito.when(passenger.getSegmentList()).thenReturn(Arrays.asList(segment));
        Mockito.when(segment.isActive()).thenReturn(true);
        Mockito.when(segment.getDepartureDate()).thenReturn(departureDay);
        Mockito.when(departureDay.get(Calendar.YEAR)).thenReturn(1989);
        Mockito.when(departureDay.get(Calendar.MONTH)).thenReturn(1);
        Mockito.when(departureDay.get(Calendar.DAY_OF_MONTH)).thenReturn(15);
        Mockito.when(calendar.get(Calendar.YEAR)).thenReturn(1989);
        Mockito.when(calendar.get(Calendar.MONTH)).thenReturn(1);
        Mockito.when(calendar.get(Calendar.DAY_OF_MONTH)).thenReturn(5);

        //when
        int result = ageAtSegment.checkAgeAtSegments(passenger, calendar);
        //then
        assertEquals(10, result);

    }


    // Moj kod jest daleko 'pozniej' - jakby co to masz sciage :)


//    private AgeAtSegment ageAtSegment;
//
//    @Mock
//    private Passenger passenger;
//    @Mock
//    private Calendar birthDayFromPassport;
//    @Mock
//    private Segment segment;
//    @Mock
//    private Calendar segmentCalendar;


//    @Before
//    public void setUp() {
//        this.ageAtSegment = new AgeAtSegment();
//    }
//
//    @Test
//    public void test() {
//         //given
//        Mockito.when(passenger.getSegmentList()).thenReturn(Arrays.asList(segment));
//
//        Mockito.when(segment.getDepartureDate()).thenReturn(segmentCalendar);
//        Mockito.when(segmentCalendar.get(Calendar.YEAR)).thenReturn(2014);
//        Mockito.when(segmentCalendar.get(Calendar.MONTH)).thenReturn(11);
//        Mockito.when(segmentCalendar.get(Calendar.DAY_OF_MONTH)).thenReturn(22);
//
//        Mockito.when(birthDayFromPassport.get(Calendar.YEAR)).thenReturn(2010);
//        Mockito.when(birthDayFromPassport.get(Calendar.MONTH)).thenReturn(11);
//        Mockito.when(birthDayFromPassport.get(Calendar.DAY_OF_MONTH)).thenReturn(22);
//
//      //  when
//        int result = ageAtSegment.checkAgeAtSegments(passenger, birthDayFromPassport);
//
//        //then
//        Assert.assertEquals(1461, result);
//    }
//
}