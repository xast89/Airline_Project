package com.learning;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.EmailList;
import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSeeker;
import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSender;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {

// TODO: Poczytac o Singletonie


        Booking bookingForSCAnalyzer = BookingFactory.createBookingForSCAnalyzer();
        
        MailSeeker mailSeeker = new MailSeeker();
        MailSender.sendEmail();




//        Booking twoAdultOneWay = BookingFactory.createTwoAdultOneWay();
//        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();
//        Booking threeAdultOneWay = BookingFactory.createThreeAdultOneWay();
//        List<Segment> segmentList = oneAdultOneWay.getPassengerList().get(0).getSegmentList();
//        SegmentSorter segmentSorter = new SegmentSorter();
////      PassangerDepartureDayAnalizer flightDayAnalizer = new PassangerDepartureDayAnalizer();
////
////       lightDayAnalizer.analyze(oneAdultOneWay);
//
//        PassengerBirthDayAnalizer passangerInformationAnalizer = new PassengerBirthDayAnalizer();
//        passangerInformationAnalizer.analyze(oneAdultOneWay);   // poprawny booking


    }
}
