package com.learning;

import com.learning.analyzer2.Passenger.PassengerAgeAnalyzer;
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

        PassengerAgeAnalyzer passengerAgeAnalyzer = new PassengerAgeAnalyzer();
        passengerAgeAnalyzer.analyze(oneAdultOneWay);

        List<Passenger> passengers = oneAdultOneWay.getPassengerList();
        for (Passenger passenger: passengers) {
            System.out.println("Passenger "
                    + passenger.getName()
                    + " "
                    + passenger.getLastName()
                    + " will have "
                    + passenger.getResultMap().get("AgeAtDepartueDate")
                    + " years on the day of departure.");
        }
    }
}
