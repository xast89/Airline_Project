package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;

import java.util.Calendar;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassportAnalizer {

    private static final String DOC = "DOC";
    private BirthdayStringConverter birthdayStringConverter;

    public PassportAnalizer() {
        this.birthdayStringConverter = new BirthdayStringConverter();
    }

    public Calendar getBirthDayFromPassport(Passenger passenger) {
        if (passenger.getPassengerInformation() == null) {
            System.out.println("Niepoprawna informacja o pasażerze.");
        } else {
            for (String passengerInformation : passenger.getPassengerInformation()) {
                if (passengerInformation.contains(DOC)) {
                    return birthdayStringConverter.convertPassengerBirthdayToInt(passengerInformation);
                }
            }
        }
        return null;
    }
}
