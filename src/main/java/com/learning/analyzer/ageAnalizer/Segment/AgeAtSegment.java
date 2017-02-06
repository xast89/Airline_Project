package com.learning.analyzer.ageAnalizer.Segment;

import com.learning.structure.booking.Segment;
import org.joda.time.DateTime;

import java.util.Calendar;

import static java.util.Calendar.*;
import static org.joda.time.Days.daysBetween;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class AgeAtSegment {


    public int countDays(Segment segment, Calendar birthDayFromPassport) {

        DateTime passengerBirthday = new DateTime(birthDayFromPassport.get(YEAR), birthDayFromPassport.get(MONTH), birthDayFromPassport.get(DAY_OF_MONTH), 0, 0, 0, 0);
        DateTime actualSegmentDate = new DateTime(segment.getDepartureDate().get(YEAR), segment.getDepartureDate().get(MONTH), segment.getDepartureDate().get(DAY_OF_MONTH), 0, 0, 0, 0);
        int days = daysBetween(passengerBirthday, actualSegmentDate).getDays();
        //TODO: zamienic na logowanie https://www.tutorialspoint.com/log4j/log4j_sample_program.htm
        System.out.println("W dni wylotu w segmencie pasazer ma lat: " + days / 365);
        return days;
    }
}




