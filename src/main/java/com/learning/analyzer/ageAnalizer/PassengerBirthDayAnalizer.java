package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.Calendar;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class PassengerBirthDayAnalizer implements Analyzer {

    private PassportAnalizer passportAnalizer;
    private AgeAtSegment ageAtSegment;

    public PassengerBirthDayAnalizer() {

        this.passportAnalizer = new PassportAnalizer();
        this.ageAtSegment = new AgeAtSegment();
    }

    public void analyze(Booking booking) {
        if(booking!=null) {

            String[] passportInfromation = null;
            for (Passenger passenger : booking.getPassengerList()) {
                Calendar birthDayFromPassport = passportAnalizer.getBirthDayFromPassport(passenger);
                if (birthDayFromPassport == null) {
                    System.out.println("Błędna data urodzenia w paszporcie.");
                    break;
                } else {
                    System.out.println("Data urodzenia pasażera to: " + birthDayFromPassport.get(Calendar.YEAR) + "." + birthDayFromPassport.get(Calendar.MONTH) + "." + birthDayFromPassport.get(Calendar.DAY_OF_MONTH));
                    ageAtSegment.checkAgeAtSegments(passenger, birthDayFromPassport);

                }
            }
        }else
            System.out.println("Sorry Pawel, booking nie moze byc nullem");
    }


}
