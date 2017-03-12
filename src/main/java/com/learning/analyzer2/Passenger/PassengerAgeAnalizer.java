package com.learning.analyzer2.Passenger;

import com.learning.analyzer2.Analyzer;
import com.learning.analyzer2.Segment.SegmentAnalyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by fd on 02.03.2017.
 */
public class PassengerAgeAnalizer implements Analyzer {

    private Date getPassengerBirthDate(Passenger p){
        PassengerInfo passengerInfo;

        //TODO: to powinno byc w konstruktorze
        PassengerInfoAnalyzer passengerInfoAnalyzer = new PassengerInfoAnalyzer();

        //TODO: a skad pewsnosc, ze potrzebna Ci informacja bedzie w drugim elemencie listy? (get(1)) ?
        //TODO: A nie na przyklad w 10 ?
        passengerInfoAnalyzer.analyze(p.getPassengerInformation().get(1));
        passengerInfo = passengerInfoAnalyzer.getPassengerInfo();

        return passengerInfo.getDirthdayDate();

    }

    @Override
    public void analyze(Booking booking) {
        //TODO: co to jest p?
        for (Passenger p: booking.getPassengerList()){
            int age;
            //TODO: literówka
            int departueYear;
            int birthdayYear;

            //TODO: literówka
            Calendar departueCalendar = Calendar.getInstance();
            Calendar birthdayCalendar = Calendar.getInstance();

            // To raczej nie tutaj. W konstruktorze powinno byc.
            // Bo jak przerobimy to na projekt Springowy to Spring wstrzykuje zależności właśnie
            // między innymi przez konstruktory
            SegmentAnalyzer segmentAnalyzer = new SegmentAnalyzer();

            departueCalendar = segmentAnalyzer.getNearestActiveSegment(p.getSegmentList()).getDepartureDate();
            birthdayCalendar.setTime(getPassengerBirthDate(p));

            departueYear = departueCalendar.get(Calendar.YEAR);
            birthdayYear = birthdayCalendar.get(Calendar.YEAR);

            age = departueYear - birthdayYear;
            if (departueCalendar.get(Calendar.MONTH) > birthdayCalendar.get(Calendar.MONTH) ||
                    (departueCalendar.get(Calendar.MONTH) == birthdayCalendar.get(Calendar.MONTH) &&
                            departueCalendar.get(Calendar.DATE) > birthdayCalendar.get(Calendar.DATE))) {
                age--;
            }

            Map<String,Object> map = new HashMap<>();
            map.put("AgeAtDepartueDate",age);
            p.setResultMap(map);
        }



    }
}
