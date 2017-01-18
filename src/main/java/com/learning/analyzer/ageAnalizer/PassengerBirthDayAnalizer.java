package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class PassengerBirthDayAnalizer implements Analyzer {

    private PassportAnalizer passportAnalizer;

    public PassengerBirthDayAnalizer() {
        this.passportAnalizer = new PassportAnalizer();
    }

    public void analyze(Booking booking) {
        String[] passportInfromation = null;
        for (Passenger passenger : booking.getPassengerList()) {
            Calendar birthDayFromPassport = passportAnalizer.getBirthDayFromPassport(passenger);
            System.out.println("Data urodzenia pasażera to: " + birthDayFromPassport.get(Calendar.YEAR) + "." + birthDayFromPassport.get(Calendar.MONTH) + "." + birthDayFromPassport.get(Calendar.DAY_OF_MONTH));
            AgeAtSegment.checkAgeAtSegments(passenger, birthDayFromPassport);


        }
    }


}
