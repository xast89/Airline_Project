package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.analyzer.ScheduleChangeAnalizer.PrzykladowyPrzygotowywacz;
import com.learning.analyzer.ScheduleChangeAnalizer.Wrapper;
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
 * Created by Cyprian on 2017-02-06.
 */
public class MailSenderTest {

    @InjectMocks
    private MailSender mailSender;
    @Mock
    private Wrapper wrapper;
    @Mock
    private PrzykladowyPrzygotowywacz przykladowyPrzygotowywacz;
    @Mock
    private Logger logger;

    @Test
    public void sendEmailFromRealBooking() {

        //given
        Mockito.when(wrapper.getTresclistu()).thenReturn("przykładowa tresc nie nullowa");
        Mockito.when(wrapper.getAdresat()).thenReturn("cforemny@gmail.com");
        Mockito.when(wrapper.getTytul()).thenReturn("Przykaldowy tytul");
        //when
        mailSender.sendEmailToAllPassangersFromCanceledSegment(wrapper);
        //then
        Mockito.verify(logger).info("Wyslano maila");
    }

    @Test
    public void sendEmailWhenMessageAboutCanceledSegmentIsNull() {
        //given
        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        Mockito.when(przykladowyPrzygotowywacz.przygotujPaczke(bookingForSCAnalyzer)).thenReturn(new Wrapper("dupa", "dupa", "dupa"));
        //when
        mailSender.sendEmailToAllPassangersFromCanceledSegment(wrapper);
        //then
        Mockito.verify(logger).info("Nie wyslano maila, brak danych.");

    }

    @Test
    public void sendEmailWhenAnyMessageAboutNewSegmentIsNull() {
        //given

        //when
        mailSender.sendEmailToAllPassangersFromCanceledSegment(wrapper);
        //then
        Mockito.verify(logger).info("Nie wyslano maila, brak danych.");

    }

}