package com.learning.analyzer2.Passenger;

import com.learning.analyzer2.Analyzer;
import com.learning.analyzer2.Segment.SegmentAnalyzer;
import com.learning.analyzer2.Segment.SegmentSortType;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.analyzer2.Segment.SegmentSorter;

import java.util.*;


/**
 * Created by fd on 02.03.2017.
 */
public class PassengerAgeAnalyzer implements Analyzer {
    private PassengerInfoAnalyzer passengerInfoAnalyzer = new PassengerInfoAnalyzer();
    private SegmentAnalyzer segmentAnalyzer = new SegmentAnalyzer();
    private SegmentSorter segmentSorter = new SegmentSorter();

    private Date getPassengerBirthDate(Passenger passenger){
        PassengerInfo passengerInfo;

        //TODO: a skad pewsnosc, ze potrzebna Ci informacja bedzie w drugim elemencie listy? (get(1)) ?
        //TODO: A nie na przyklad w 10 ?
        //Odp: Bo takie zalozenia projektu :)

        passengerInfoAnalyzer.createInfo(passenger.getPassengerInformation().get(1));
        passengerInfo = passengerInfoAnalyzer.getPassengerInfo();

        return passengerInfo.getDirthdayDate();

    }

    @Override
    public void analyze(Booking booking) {

        for (Passenger passenger: booking.getPassengerList()){
            int age;
            int departureYear;
            int birthdayYear;
            Segment tempSegment;

            Calendar departureCalendar = Calendar.getInstance();
            Calendar birthdayCalendar = Calendar.getInstance();

            List<Segment> segmentList = passenger.getSegmentList();
            segmentSorter.sortBy(segmentList, SegmentSortType.DEPARTURE_DATE);

            tempSegment = segmentAnalyzer.getNearestActiveSegment(segmentList);

            if(tempSegment == null){

                return;
            }

            departureCalendar = tempSegment.getDepartureDate();
            birthdayCalendar.setTime(getPassengerBirthDate(passenger));

            departureYear = departureCalendar.get(Calendar.YEAR);
            birthdayYear = birthdayCalendar.get(Calendar.YEAR);

            age = departureYear - birthdayYear;
            if (departureCalendar.get(Calendar.MONTH) > birthdayCalendar.get(Calendar.MONTH) ||
                    (departureCalendar.get(Calendar.MONTH) == birthdayCalendar.get(Calendar.MONTH) &&
                            departureCalendar.get(Calendar.DATE) > birthdayCalendar.get(Calendar.DATE))) {
                age--;
            }

            Map<String,Object> map = new HashMap<>();
            map.put("AgeAtDepartueDate",age);
            passenger.setResultMap(map);
        }



    }
}
