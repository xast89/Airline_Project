package com.learning;

import com.learning.analyzer2.Passenger.PassengerAgeAnalizer;
import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.List;

/**
 * Created by pawel on 15.01.17.
 */
public class Main {

    public static void main(String[] args) {


        Booking oneAdultOneWay = BookingFactory.createOneAdultOneWay();

        PassengerAgeAnalizer passengerAgeAnalizer = new PassengerAgeAnalizer();
        passengerAgeAnalizer.analyze(oneAdultOneWay);

        List<Passenger> passengers = oneAdultOneWay.getPassengerList();
        for (Passenger p: passengers) {
            System.out.println("Passenger "
                    + p.getName()
                    + " "
                    + p.getLastName()
                    + " will have "
                    + p.getResultMap().get("AgeAtDepartueDate")
                    + " years on the day of departure.");
        }

    }
}
