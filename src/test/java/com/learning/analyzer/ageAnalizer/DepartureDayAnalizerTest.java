package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.ageAnalizer.Date.DepartureDayAnalizer;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.structure.util.AirportEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static com.learning.structure.util.FlightStatus.ACTIVE;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-01-19.
 */
public class DepartureDayAnalizerTest {

    @InjectMocks
    private DepartureDayAnalizer departureDayAnalizer;

    @Mock
    Passenger passenger;

    @Test
    public void analyzeDepartureDay() throws Exception {
        //given
        Mockito.when(passenger.getSegmentList()).thenReturn(createTestSegmentList());
        //when
        departureDayAnalizer.analyzeDepartureDay(passenger);
        //then
        assertNotEquals(passenger.getSegmentList().get(0), passenger.getSegmentList().get(1));
    }

    private List<Segment> createTestSegmentList() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 10, 12);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar(2000, 10, 13);
        Segment segment0 = new Segment(AirportEnum.GDN, AirportEnum.KRK, gregorianCalendar, gregorianCalendar1, 651, "AB737", ACTIVE);
        Segment segment1 = new Segment(AirportEnum.GDN, AirportEnum.KRK, gregorianCalendar, gregorianCalendar1, 641, "AB767", ACTIVE);
        Segment segment2 = new Segment(AirportEnum.GDN, AirportEnum.KRK, gregorianCalendar, gregorianCalendar1, 601, "AB577", ACTIVE);

        List<Segment> segments = new ArrayList<Segment>();
        segments.add(segment0);
        segments.add(segment1);
        segments.add(segment2);

        return segments;
    }

}