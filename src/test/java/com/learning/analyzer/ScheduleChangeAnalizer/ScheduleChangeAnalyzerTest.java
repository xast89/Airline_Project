package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-02-08.
 */
public class ScheduleChangeAnalyzerTest {

    @InjectMocks
    private ScheduleChangeAnalyzer scheduleChangeAnalyzer;

    @Mock
    private Booking booking;
    @Mock
    private Logger logger;


    @Test
    public void analyzeWhenBookinsIsNull() {

        //given
        booking = null;
        //when
        scheduleChangeAnalyzer.analyze(booking);
        //then
        Mockito.verify(logger).info("Nullowy booking! Nieakceptowalne!");

    }
    @Test
    public void analyzeWhenBookinsIsNotNull() {

        //given
        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        //when
        scheduleChangeAnalyzer.analyze(bookingForSCAnalyzer);
        //then
        Mockito.verify(logger).info("Poszlo");

    }

}