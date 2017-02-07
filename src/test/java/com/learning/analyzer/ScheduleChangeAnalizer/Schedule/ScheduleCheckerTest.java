package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cyprian on 2017-02-02.
 */
public class ScheduleCheckerTest {

    private ChangedSchedule scheduleChecker;

    @Before
    public void setUp(){
        scheduleChecker = new ChangedSchedule();
    }

    @Test
    public void scheckIfScheduleIsChanged() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        boolean result = scheduleChecker.findSegmentInformation(booking.getPassengerList().get(0).getSegmentList());
        //then
        assertTrue(result);


    }


}