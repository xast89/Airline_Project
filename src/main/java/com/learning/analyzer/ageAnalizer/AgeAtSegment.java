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

    public int checkAgeAtSegments(Passenger passenger, Calendar birthDayFromPassport) {
        int days;
        //TODO: a moze wartosc sie zastanowić, by ta metodka dostawala pierwszy aktywny segment Pasazera i wyliczala
        //TODO: tylko jego wiek ? W sensie reszte logiki wyrzucic poza ta matode (moze zrobic osobna?)
        //TODO: no i zmienic nazwe. Bo ona na pewno nie robi "checkAgeAtSegments"
        for (Segment segment : passenger.getSegmentList()) {
            //TODO: Sprawdz w debugerze jaka wartosc ma days zaraz po utworzeniu (19 linijka) Potrzeba przypisywac 0?
            days = 0;
            if (segment.isActive()) {
                //TODO: Static import sie klania
                DateTime passengerBirthday = new DateTime(birthDayFromPassport.get(Calendar.YEAR), birthDayFromPassport.get(Calendar.MONTH), birthDayFromPassport.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
                DateTime actualSegmentDate = new DateTime(segment.getDepartureDate().get(Calendar.YEAR), segment.getDepartureDate().get(Calendar.MONTH), segment.getDepartureDate().get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0);
                days = Days.daysBetween(passengerBirthday, actualSegmentDate).getDays();
                //TODO: zamienic na logowanie https://www.tutorialspoint.com/log4j/log4j_sample_program.htm
                System.out.println("W dni wylotu w segmencie pasazer ma lat: " + days / 365);
                return days;
           }
        }
        //TODO: A to co za liczba z dupy?
        return 1000;

    }

}




