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

    public void analyze(Booking booking) {
        String[] passportInfromation = null;
        List<Passenger> passengerList = booking.getPassengerList();
        for (Passenger passenger : passengerList) {
            Calendar birthDayFromPassport = PassportAnalizer.getBirthDayFromPassport(passenger);
            System.out.println("Data urodzenia pasażera to: " + birthDayFromPassport.get(Calendar.YEAR) + "." + birthDayFromPassport.get(Calendar.MONTH) + "." + birthDayFromPassport.get(Calendar.DAY_OF_MONTH));
            AgeAtSegment.checkAgeAtSegments(passenger, birthDayFromPassport);


        }
    }


}
