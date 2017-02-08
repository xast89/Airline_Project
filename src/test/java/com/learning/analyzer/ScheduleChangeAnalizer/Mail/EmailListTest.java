package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Cyprian on 2017-02-06.
 */
public class EmailListTest {

    private EmailList emailList;

    @Before
    public void setUp() {
        emailList = new EmailList();
    }

    @Test
    public void checkIfEmailsListIsNotNull() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        List<String> result = emailList.createEmailAdressesList(booking);
        //then
        assertNotNull(result);
    }

    @Test
    public void checkIfEmailsListIsEqualToRealListFromBooking() {

        //given
        Booking booking = BookingFactory.createBookingForSCAnalyzer();
        //when
        List<String> result = emailList.createEmailAdressesList(booking);

        //then
        assertEquals(Arrays.asList("cforemny@gmail.com", "pawel.gondek@gmail.com ", "cforemny@gmail.com"), result);
    }



}