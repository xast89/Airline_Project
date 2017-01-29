package com.learning.analyzer.ageAnalizer.Segment;

import com.learning.structure.booking.Segment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-29.
 */
public class SegmentSorterTest {

    @InjectMocks
    private SegmentSorter segmentSorter;
    @Mock
    private Segment segment;
    @Mock
    private Segment segment1;


    @Test
    public  void checkIfSegmentListIsProperlySorted(){
        //given
        Calendar departureDay1 = new GregorianCalendar(2000, 1, 1);
        Calendar departureDay2 = new GregorianCalendar(2010, 1, 1);
        Mockito.when(segment.getDepartureDate()).thenReturn(departureDay1);
        Mockito.when(segment1.getDepartureDate()).thenReturn(departureDay2);

        //when
        int result = segmentSorter.compare(segment,segment1);
        //then
        assertEquals(-1,result);
    }
    @Test
    public  void checkWhenSegmentsHaveSameDepartureDates(){

        //given
        Calendar departureDay1 = new GregorianCalendar(2000, 1, 1);
        Calendar departureDay2 = new GregorianCalendar(2000, 1, 1);
        Mockito.when(segment.getDepartureDate()).thenReturn(departureDay1);
        Mockito.when(segment1.getDepartureDate()).thenReturn(departureDay2);

        //when
        int result = segmentSorter.compare(segment,segment1);
        //then
        assertEquals(0,result);
    }

}