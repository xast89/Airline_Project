package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Cyprian on 2017-02-02.
 */
public class ChangedScheduleTest {

    private ChangedSchedule changedSchedule;

    @Before
    public void setUp() {
        changedSchedule = new ChangedSchedule();
    }

    @Test
    public void checkIfScheduleIsChanged() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        boolean result = changedSchedule.findSegmentInformation(booking.getPassengerList().get(0).getSegmentList());
        //then
        assertTrue(result);


    }


}