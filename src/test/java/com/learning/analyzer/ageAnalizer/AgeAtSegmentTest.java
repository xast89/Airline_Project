package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Calendar;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)

//@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-19.
 */
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
    Days days;

    @Test
    public void testCheckAgeAtSegments() {
        //TODO: POPRAWIC TEST, BO NIE DZIALA
        //given
        DateTime dateTime = new DateTime(2010, 10, 10, 0, 0, 0);
        DateTime dateTime1 = new DateTime(2010, 10, 17, 0, 0, 0);
        PowerMockito.mockStatic(Days.class);
        PowerMockito.when(Days.daysBetween(dateTime, dateTime1).getDays()).thenReturn(7);

        //when
        int result = ageAtSegment.checkAgeAtSegments(passenger, calendar);
        //then
        assertEquals(7,result);

    }


}