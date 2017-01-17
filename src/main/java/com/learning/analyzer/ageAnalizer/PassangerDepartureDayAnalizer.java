package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.List;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class PassangerDepartureDayAnalizer implements Analyzer {

    public void analyze(Booking booking) {
        List<Passenger> passengerList = booking.getPassengerList();
        for (Passenger passenger : passengerList) {
            DepartureDayAnalizer.analyzeDepartureDay(passenger);
        }
    }
}


