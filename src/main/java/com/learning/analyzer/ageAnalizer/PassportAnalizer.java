package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;

import java.util.Calendar;
/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassportAnalizer {

  private  Passenger passenger;
  private BirthdayStringConverter birthdayStringConverter;

    public PassportAnalizer(Passenger passenger, BirthdayStringConverter birthdayStringConverter) {
        this.passenger = passenger;
        this.birthdayStringConverter = birthdayStringConverter;
    }

    public PassportAnalizer(Passenger passenger) {
        this.passenger = passenger;
    }

    public PassportAnalizer() {
    }

    public Calendar getBirthDayFromPassport(Passenger passenger) {
        String[] passportInfromation;
        for (String s : passenger.getPassengerInformation()) {
            if (s.contains("DOC")) {
              return birthdayStringConverter.convertPassengerBirthdayToInt(s);
            }
        }
        return null;
    }


}
