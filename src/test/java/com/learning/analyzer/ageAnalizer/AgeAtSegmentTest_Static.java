package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;
import java.util.Calendar;

import static org.mockito.Matchers.any;

/**
 * Created by Cyprian on 2017-01-19.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Days.class)
public class AgeAtSegmentTest_Static {

    private AgeAtSegment ageAtSegment;

    @Mock
    private Passenger passenger;
    @Mock
    private Calendar birthDayFromPassport;
    @Mock
    private Segment segment;
    @Mock
    private Calendar segmentCalendar;
    @Mock
    private Days days;


    @Before
    public void setUp() {
        this.ageAtSegment = new AgeAtSegment();
    }

    @Test
    public void test() {
//         given
        Mockito.when(passenger.getSegmentList()).thenReturn(Arrays.asList(segment));

        Mockito.when(segment.getDepartureDate()).thenReturn(segmentCalendar);
        Mockito.when(segmentCalendar.get(Calendar.YEAR)).thenReturn(2014);
        Mockito.when(segmentCalendar.get(Calendar.MONTH)).thenReturn(11);
        Mockito.when(segmentCalendar.get(Calendar.DAY_OF_MONTH)).thenReturn(22);

        Mockito.when(birthDayFromPassport.get(Calendar.YEAR)).thenReturn(2010);
        Mockito.when(birthDayFromPassport.get(Calendar.MONTH)).thenReturn(11);
        Mockito.when(birthDayFromPassport.get(Calendar.DAY_OF_MONTH)).thenReturn(22);


        PowerMockito.mockStatic(Days.class);
        PowerMockito.when(Days.daysBetween(any(DateTime.class), any(DateTime.class))).thenReturn(days);
        PowerMockito.when(days.getDays()).thenReturn(500);
//        when
        int result = ageAtSegment.checkAgeAtSegments(passenger, birthDayFromPassport);

//        then
        Assert.assertEquals(500, result);
    }

}
