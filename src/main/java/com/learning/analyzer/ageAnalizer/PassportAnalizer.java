package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;

import java.util.Calendar;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassportAnalizer {

    public PassportAnalizer() {
    }

    public static
    Calendar getBirthDayFromPassport(Passenger passenger) {
        String[] passportInfromation;
        for (String s : passenger.getPassengerInformation()) {
            if (s.contains("DOC")) {
                return BirthdayStringConverter.convertPassengerBirthdayToInt(s);
            }
        }
        return null;
    }


}
