package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cyprian on 2017-02-02.
 */
public class ScheduleCheckerTest {

    private ScheduleChecker scheduleChecker;

    @Before
    public void setUp(){
        scheduleChecker = new ScheduleChecker();
    }

    @Test
    public void scheckIfScheduleIsChanged() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        boolean result = scheduleChecker.findSegmentInformation(booking.getPassengerList().get(0).getSegmentList().get(0));
        //then
        assertTrue(result);


    }

    @Test
    public void scheckIfScheduleIsOkay() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        boolean result = scheduleChecker.findSegmentInformation(booking.getPassengerList().get(0).getSegmentList().get(1));
        //then
        assertFalse(result);


    }


}