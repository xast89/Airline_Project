package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Calendar;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class AgeAtSegment {

    public AgeAtSegment() {
    }

    public void checkAgeAtSegments(Passenger passenger, Calendar birthDayFromPassport) {

        for (Segment segment : passenger.getSegmentList()) {
            int days=0;
            DateTime passengerBirthday = new DateTime(birthDayFromPassport.get(Calendar.YEAR), birthDayFromPassport.get(Calendar.MONTH), birthDayFromPassport.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
            DateTime actualSegmentDate = new DateTime(segment.getDepartureDate().get(Calendar.YEAR), segment.getDepartureDate().get(Calendar.MONTH), segment.getDepartureDate().get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
            days = Days.daysBetween(passengerBirthday,actualSegmentDate).getDays();
            System.out.println("W dni wylotu w segmencie pasazer ma lat: " + days/365);
        }


    }


}
