package com.learning;

import com.learning.analyzer.ageAnalizer.PassangerBirthDayAnalizer;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {

        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();
        PassangerBirthDayAnalizer passangerInformationAnalizer = new PassangerBirthDayAnalizer();
        passangerInformationAnalizer.analyze(oneAdultOneWay);


        //System.out.println(oneAdultOneWay);

    }
}
