package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import org.joda.time.DateTime;

import java.util.Calendar;

import static org.joda.time.Days.daysBetween;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class AgeAtSegment {

    private ActiveSegment activeSegment;
    private Passenger passenger;

    public AgeAtSegment() {
        this.activeSegment = new ActiveSegment();
            }

    public int countDays(Segment segment, Calendar birthDayFromPassport) {

        int days;
        DateTime passengerBirthday = new DateTime(birthDayFromPassport.get(Calendar.YEAR), birthDayFromPassport.get(Calendar.MONTH), birthDayFromPassport.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
        DateTime actualSegmentDate = new DateTime(segment.getDepartureDate().get(Calendar.YEAR), segment.getDepartureDate().get(Calendar.MONTH), segment.getDepartureDate().get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
        days = daysBetween(passengerBirthday, actualSegmentDate).getDays();
        //TODO: zamienic na logowanie https://www.tutorialspoint.com/log4j/log4j_sample_program.htm
        System.out.println("W dni wylotu w segmencie pasazer ma lat: " + days / 365);
        return days;
    }
}




