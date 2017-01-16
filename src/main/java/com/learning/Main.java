package com.learning;

import com.learning.analyzer.ageAnalizer.PassangerInformationAnalizer;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.util.AirportEnum;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {

        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();
        PassangerInformationAnalizer passangerInformationAnalizer = new PassangerInformationAnalizer();
        passangerInformationAnalizer.analyze(oneAdultOneWay);


        //System.out.println(oneAdultOneWay);

    }
}
