package com.learning.analyzer2.Passenger;

import com.learning.analyzer2.Analyzer;
import com.learning.analyzer2.Date.DateAnalyzer;
import com.learning.analyzer2.Date.DifferenceDateType;
import com.learning.analyzer2.Segment.SegmentAnalyzer;
import com.learning.analyzer2.Segment.SegmentSortType;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.analyzer2.Segment.SegmentSorter;
import org.apache.log4j.Logger;
import java.util.*;

import static java.util.Calendar.*;

/**
 * Created by fd on 02.03.2017.
 */
public class PassengerAgeAnalyzer implements Analyzer {
    private PassengerInfoAnalyzer passengerInfoAnalyzer = new PassengerInfoAnalyzer();
    private SegmentAnalyzer segmentAnalyzer = new SegmentAnalyzer();
    private SegmentSorter segmentSorter = new SegmentSorter();
    private DateAnalyzer dateAnalyzer = new DateAnalyzer();
    private static Logger log = Logger.getLogger(PassengerAgeAnalyzer.class.getName());

    private Date getPassengerBirthDate(Passenger passenger){
        PassengerInfo passengerInfo;

        //TODO: a skad pewsnosc, ze potrzebna Ci informacja bedzie w drugim elemencie listy? (get(1)) ?
        //TODO: A nie na przyklad w 10 ?
        //Odp: Bo takie zalozenia projektu :)
        //TODO: na chwile obecną jest to drugi element. Ale tego nie jestes pewny. To musisz zmienić

        passengerInfoAnalyzer.createInfo(passenger.getPassengerInformation().get(1));
        passengerInfo = passengerInfoAnalyzer.getPassengerInfo();

        return passengerInfo.getDirthdayDate();

    }

    @Override
    public void analyze(Booking booking) {

        for (Passenger passenger: booking.getPassengerList()){
            int passengerAge;
            Segment nearestActiveSegment;

            Calendar departureCalendar = Calendar.getInstance();
            Calendar birthdayCalendar = Calendar.getInstance();

            segmentSorter.sortBy(passenger.getSegmentList(), SegmentSortType.DEPARTURE_DATE);

            nearestActiveSegment = segmentAnalyzer.getNearestActiveSegment(passenger.getSegmentList());

            if(nearestActiveSegment == null){
                log.error("The passenger dosen't have any segment.");
                return;
            }

            departureCalendar = nearestActiveSegment.getDepartureDate();
            birthdayCalendar.setTime(getPassengerBirthDate(passenger));

            passengerAge = dateAnalyzer.getDifferenceBetween(departureCalendar,birthdayCalendar, DifferenceDateType.YEARS);

            Map<String,Object> map = new HashMap<>();
            map.put("AgeAtDepartueDate",passengerAge);
            passenger.setResultMap(map);
        }



    }
}
