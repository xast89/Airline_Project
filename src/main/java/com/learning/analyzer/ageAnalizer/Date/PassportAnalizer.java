package com.learning.analyzer.ageAnalizer.Date;

import com.learning.analyzer.ageAnalizer.BirthdayStringConverter;
import com.learning.structure.booking.Passenger;
import org.mockito.internal.matchers.Null;

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
                if(passengerInformation==null){
                    System.out.println("Passanger information nie moga byc NULL");

                }
               else if (passengerInformation.contains(DOC)) {
                    return birthdayStringConverter.convertPassengerBirthdayToInt(passengerInformation);
                }
            }
        }
        return null;
    }
}
