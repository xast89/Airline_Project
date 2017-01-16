package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassportAnalizer {

    public static void getBirthDayFromPassport(Passenger passenger) {
        String[] passportInfromation;
        for (String s : passenger.getPassengerInformation()) {
            if (s.contains("DOC")) {
                passportInfromation = s.split("/");
                System.out.println("Data urodzenia pasażera to: " + passportInfromation[4]);
            }
        }
    }
}
