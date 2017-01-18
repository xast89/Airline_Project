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
        // new SkrzynkaANardzie()
        DepartureDayAnalizer departureDayAnalizer = new DepartureDayAnalizer();
        List<Passenger> passengerList = booking.getPassengerList();
        for (Passenger passenger : passengerList) {
            departureDayAnalizer.analyzeDepartureDay(passenger);
        }
    }

    public int drugaMetodka()
    {
        return 8;
    }
}


