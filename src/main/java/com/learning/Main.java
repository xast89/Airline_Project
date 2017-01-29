package com.learning;

import com.learning.analyzer.ageAnalizer.Date.PassengerBirthDayAnalizer;
import com.learning.analyzer.ageAnalizer.Segment.SegmentSorter;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Segment;

import java.util.List;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {

// TODO: Poczytac o Singletonie

        //F7 -> wchodzi do metody
        //F8 -> krok naprzod
        //F9 -> puszcza debaga do nastepnego breakpointa
        Booking twoAdultOneWay = BookingFactory.createTwoAdultOneWay();
        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();
        Booking threeAdultOneWay = BookingFactory.createThreeAdultOneWay();
        List<Segment> segmentList = oneAdultOneWay.getPassengerList().get(0).getSegmentList();
        SegmentSorter segmentSorter = new SegmentSorter();
//        PassangerDepartureDayAnalizer flightDayAnalizer = new PassangerDepartureDayAnalizer();
//
//        flightDayAnalizer.analyze(oneAdultOneWay);

        PassengerBirthDayAnalizer passangerInformationAnalizer = new PassengerBirthDayAnalizer();
        passangerInformationAnalizer.analyze(oneAdultOneWay);   // poprawny booking

    }
}
