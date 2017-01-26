package com.learning;

import com.learning.analyzer.ageAnalizer.Date.PassengerBirthDayAnalizer;
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
        Booking twoAdultOneWay = BookingFactory.createTwoAdultOneWay();
        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();
        Booking threeAdultOneWay = BookingFactory.createThreeAdultOneWay();

//        PassangerDepartureDayAnalizer flightDayAnalizer = new PassangerDepartureDayAnalizer();
//
//        flightDayAnalizer.analyze(oneAdultOneWay);

        PassengerBirthDayAnalizer passangerInformationAnalizer = new PassengerBirthDayAnalizer();
        passangerInformationAnalizer.analyze(oneAdultOneWay);   // poprawny booking
        System.out.println();
        passangerInformationAnalizer.analyze(twoAdultOneWay);   //  booking z nullowymi danymi
        System.out.println();
        passangerInformationAnalizer.analyze(threeAdultOneWay);  // booking z niepoprawnym formatem daty ruodzenia


    }
}
