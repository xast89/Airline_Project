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

// TODO: Poczytac o Singletonie

        //F7 -> wchodzi do metody
        //F8 -> krok naprzod
        //F9 -> puszcza debaga do nastepnego breakpointa
        Booking oneAdultOneWay = BookingFactory.createTwoAdultOneWay();
//        PassangerDepartureDayAnalizer flightDayAnalizer = new PassangerDepartureDayAnalizer();
//
//        flightDayAnalizer.analyze(oneAdultOneWay);

        PassengerBirthDayAnalizer passangerInformationAnalizer = new PassengerBirthDayAnalizer();
        passangerInformationAnalizer.analyze(null);


    }
}
