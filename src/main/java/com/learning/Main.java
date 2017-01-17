package com.learning;

import com.learning.analyzer.ageAnalizer.PassangerDepartureDayAnalizer;
import com.learning.analyzer.ageAnalizer.PassengerBirthDayAnalizer;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {

        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();
        PassangerDepartureDayAnalizer flightDayAnalizer = new PassangerDepartureDayAnalizer();
        flightDayAnalizer.analyze(oneAdultOneWay);
        PassengerBirthDayAnalizer passangerInformationAnalizer = new PassengerBirthDayAnalizer();
        passangerInformationAnalizer.analyze(oneAdultOneWay);


    }
}
