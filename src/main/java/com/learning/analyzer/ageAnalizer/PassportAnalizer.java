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
        String[] passportInfromation;
        //TODO: A co to jest to 's' ?
        for (String s : passenger.getPassengerInformation()) {
            // TODO: czy na pewno ta metoda powinna sprawdzac czy lista PassegerInformation jest pusta? Moze to zrobic gdzies wyzej?
            if (s == null) {
                System.out.println("Niepoprawna informacja o pasażerze.");
                break;
            } else {
                if (s.contains(DOC)) {
                    return birthdayStringConverter.convertPassengerBirthdayToInt(s);
                }
            }

        }
        return null;
    }


}
