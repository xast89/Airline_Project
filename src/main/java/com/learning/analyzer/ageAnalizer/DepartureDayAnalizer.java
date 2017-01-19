package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;

import java.util.Calendar;

/**
 * Created by Cyprian on 2017-01-16.
 */
public class DepartureDayAnalizer {

    public DepartureDayAnalizer() {
    }

    public void analyzeDepartureDay(Passenger passenger) {
        for (Segment segment : passenger.getSegmentList()) {
            Calendar departureDate = segment.getDepartureDate();
            System.out.println("Data wylotu: " + departureDate.get(Calendar.YEAR) + "." + departureDate.get(Calendar.MONTH) + "." + +departureDate.get(Calendar.DAY_OF_MONTH));

        }

    }
}
