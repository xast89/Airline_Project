package com.learning.analyzer.ageAnalizer.Segment;

import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-26.
 */
public class ActiveSegmentTest {

    @InjectMocks
    private ActiveSegment activeSegment;

    private Booking booking;

    @Mock
    private Passenger passenger;
    @Mock
    private Segment segment;

    @Before
    public void setUo() {
        activeSegment = new ActiveSegment();
    }


    @Test
    public void checkIfThereAreNoneActiveSegmentsOnSegmentsList() {

        //given
        Mockito.when(passenger.getSegmentList()).thenReturn(asList(segment));
        Mockito.when(segment.isActive()).thenReturn(false);
        //when
        Segment result = activeSegment.findActiveSegment(passenger);
        //then
        assertNull(result);

    }

    @Test
    public void checkIfAnyOfSegmentsIsActive() {

        //given
        Mockito.when(passenger.getSegmentList()).thenReturn(asList(segment));
        Mockito.when(segment.isActive()).thenReturn(true);
        //when
        Segment result = this.activeSegment.findActiveSegment(passenger);
        //then
        assertEquals(segment, result);

    }

}