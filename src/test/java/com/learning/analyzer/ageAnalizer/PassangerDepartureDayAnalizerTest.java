package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.ageAnalizer.Date.DepartureDayAnalizer;
import com.learning.analyzer.ageAnalizer.Date.PassangerDepartureDayAnalizer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
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

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-22.
 */
public class PassangerDepartureDayAnalizerTest {

    @Mock
    Booking booking;
    @Mock
    Passenger passenger;
    @Mock
    DepartureDayAnalizer departureDayAnalizer;
    @Mock
    Segment segment;
    @Mock
    Calendar departureDate;
    @InjectMocks
    private PassangerDepartureDayAnalizer passangerDepartureDayAnalizer;

    @Before
    public void setUp() {

        passangerDepartureDayAnalizer = new PassangerDepartureDayAnalizer();

    }


    // Testy z dupy bo metoda tylko iteruje po 1 elemencie i wyswietla
    @Test
    public void analyze() throws Exception {

        //given
        Mockito.when(booking.getPassengerList()).thenReturn(Arrays.asList(passenger));
        Mockito.when(segment.getDepartureDate()).thenReturn(departureDate);
        Mockito.when(departureDate.get(Calendar.YEAR)).thenReturn(2000);
        //when
        passangerDepartureDayAnalizer.analyze(booking);
        //then
        Assert.assertEquals(segment.getDepartureDate().get(Calendar.YEAR), 2000);


    }

}