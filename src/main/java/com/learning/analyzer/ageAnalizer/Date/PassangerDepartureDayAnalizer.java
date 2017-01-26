package com.learning.analyzer.ageAnalizer.Date;

import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassangerDepartureDayAnalizer implements Analyzer {

    public void analyze(Booking booking) {

        DepartureDayAnalizer departureDayAnalizer = new DepartureDayAnalizer();
        for (Passenger passenger : booking.getPassengerList()) {
            departureDayAnalizer.analyzeDepartureDay(passenger);
        }
    }
}


