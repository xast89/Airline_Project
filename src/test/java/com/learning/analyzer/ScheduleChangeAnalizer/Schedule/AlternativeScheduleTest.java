package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Segment;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import static com.learning.factory.SegmentFactory.segmentForSCAnalyzer;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Cyprian on 2017-02-07.
 */
public class AlternativeScheduleTest {


    public static final String SCHEDULE_CHANGE = "Schedule Change";
    private AlternativeSchedule alternativeSchedule;

    @Before
    public void setUo() {
        alternativeSchedule = new AlternativeSchedule();
    }

    @Test
    public void isScheduleOk() {
        //given
        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        //when
        boolean result = alternativeSchedule.findAlternativeSegmentInformation(bookingForSCAnalyzer.getPassengerList().get(0).getSegmentList());
        //then
        assertTrue(result);
    }

    @Test
    public void isScheduleNotOk() {
        //given

        //when
        boolean result = alternativeSchedule.findAlternativeSegmentInformation(createSegmentList());
        //then
        assertFalse(result);

    }

    private List<Segment> createSegmentList() {
        return Arrays.asList(
                segmentForSCAnalyzer(
                        new GregorianCalendar(2017, 5, 14),
                        new GregorianCalendar(2017, 5, 21),
                        Arrays.asList(SCHEDULE_CHANGE)),
                segmentForSCAnalyzer(
                        new GregorianCalendar(2017, 5, 17),
                        new GregorianCalendar(2017, 5, 24),
                        Arrays.asList(SCHEDULE_CHANGE)
                ));
    }


}