package com.learning.analyzer.ageAnalizer.Date;

import com.learning.analyzer.ageAnalizer.Segment.ActiveSegment;
import com.learning.analyzer.ageAnalizer.Segment.AgeAtSegment;
import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.Calendar;
import java.util.Map;

import static java.util.Calendar.*;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class PassengerBirthDayAnalizer implements Analyzer {

    //TODO: cos pokresla na zielono -> blad w nazwie
    private PassportAnalizer passportAnalizer;
    private AgeAtSegment ageAtSegment;
    private ActiveSegment activeSegment;

    public PassengerBirthDayAnalizer() {

        this.passportAnalizer = new PassportAnalizer();
        this.ageAtSegment = new AgeAtSegment();
        this.activeSegment = new ActiveSegment();
    }

    public void analyze(Booking booking) {
//
//        if(checkIfBookingIsOk(booking))
//        {
//            // wykonuje caly kod
//        }else
//        {
//            // wywala sie z bledem jakims
//        }
        if (booking != null) {

            for (Passenger passenger : booking.getPassengerList()) {
                Calendar birthDayFromPassport = passportAnalizer.getBirthDayFromPassport(passenger);
                if (birthDayFromPassport == null) {
                    System.out.println("Błędna data urodzenia w paszporcie.");
                    break;
                } else {
                    System.out.println("Data urodzenia pasażera to: " + birthDayFromPassport.get(YEAR) + "." + birthDayFromPassport.get(MONTH) + "." + birthDayFromPassport.get(DAY_OF_MONTH));
                    int passengerASDFSADF = ageAtSegment.countDays(activeSegment.findActiveSegment(passenger), birthDayFromPassport);

                    int wiekWLatach = passengerASDFSADF / 365;

                    passenger.getResultMap().put("Anal_1", wiekWLatach);


                }
            }
        } else
            //TODO: logownie zamiast printowanie na konsole
            System.out.println("Sorry Pawel, booking nie moze byc nullem");
    }

    private boolean checkIfBookingIsOk(Booking booking) {

        if(booking == null || booking.getPassengerList() ==null)
        {
            return false;
        }

        return true;
    }


}
