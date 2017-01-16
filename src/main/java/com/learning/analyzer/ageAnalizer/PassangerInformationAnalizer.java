package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.List;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassangerInformationAnalizer implements Analyzer {

    // private Passenger passenger = PassengerFactory.oneAdultOneWay();

    public void analyze(Booking booking) {
        String[] passportInfromation = null;
        List<Passenger> passengerList = booking.getPassengerList();
        for (Passenger passenger : passengerList) {
            for (String s : passenger.getPassengerInformation()) {
                if (s.contains("DOC")) {
                    passportInfromation = s.split("/");
                    System.out.println("Data urodzenia pasażera to: " + passportInfromation[4]);
                }
            }
        }
    }
}
