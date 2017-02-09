package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.analyzer.ScheduleChangeAnalizer.PrzykladowyPrzygotowywacz;
import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.MessageCreator;
import com.learning.analyzer.ScheduleChangeAnalizer.Wrapper;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Segment;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import static com.learning.factory.SegmentFactory.segmentForSCAnalyzer;


@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-02-06.
 */
public class MailSenderTest {

    @InjectMocks
    private MailSender mailSender;
    public static final String SCHEDULE_CHANGE = "Schedule Change";
    @Mock
    private Wrapper wrapper;
    @Mock
    private PrzykladowyPrzygotowywacz przykladowyPrzygotowywacz;
    @Mock
    private Logger logger;
    @Mock
    private MessageCreator messageCreator;
    @Mock
    private List<Segment> segmentList;

    @Test
    public void sendEmailFromRealBooking() {

        //given
        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        Mockito.when(wrapper.getTresclistu()).thenReturn("przykładowa tresc nie nullowa");
        Mockito.when(wrapper.getAdresat()).thenReturn("cforemny@gmail.com");
        Mockito.when(wrapper.getTytul()).thenReturn("Przykaldowy tytul");
        //when
        mailSender.preapreAndSendEmailToAllPassangersFromCanceledSegment(wrapper);
        //then
        Mockito.verify(logger).info("Wyslano maila");
    }

    @Test
    public void sendEmailWhenMessageAboutCanceledSegmentIsNull() {
        //given
        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        Mockito.when(przykladowyPrzygotowywacz.przygotujPaczke(bookingForSCAnalyzer)).thenReturn(new Wrapper("dupa","dupa","dupa"));
        //when
        mailSender.preapreAndSendEmailToAllPassangersFromCanceledSegment(wrapper);
        //then
        Mockito.verify(logger).info("Nie wyslano maila, brak danych.");

    }

    @Test
    public void sendEmailWhenAnyMessageAboutNewSegmentIsNull() {
        //given

        //when
        mailSender.preapreAndSendEmailToAllPassangersFromCanceledSegment(wrapper);
        //then
        Mockito.verify(logger).info("Nie wyslano maila, brak danych.");

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