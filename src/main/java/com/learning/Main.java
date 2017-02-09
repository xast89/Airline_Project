package com.learning;

import com.learning.analyzer.ScheduleChangeAnalizer.ScheduleChangeAnalyzer;
import com.learning.analyzer.activationCode.ActivationCodeCreator;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {

// TODO: Poczytac o Singletonie


        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        ScheduleChangeAnalyzer scheduleChangeAnalyzer = new ScheduleChangeAnalyzer();
        scheduleChangeAnalyzer.analyze(bookingForSCAnalyzer);

        ActivationCodeCreator activationCodeCreator = new ActivationCodeCreator();
        activationCodeCreator.createActivationCode(bookingForSCAnalyzer.getPassengerList());


    }
}
