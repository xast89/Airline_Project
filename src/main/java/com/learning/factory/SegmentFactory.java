package com.learning.factory;

import com.learning.structure.booking.Segment;
import com.learning.structure.util.AirportEnum;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static com.learning.structure.util.FlightStatus.ACTIVE;

/**
 * Created by pawel on 15.01.17.
 */
public class SegmentFactory {

    public SegmentFactory() {
    }

    public static Segment oneWay(AirportEnum departureAirport, AirportEnum arrivalAirport) {
        Calendar departureDate = new GregorianCalendar(2017, 3, 29);
        Calendar arrivalDate = new GregorianCalendar(2017, 3, 30);

        return new Segment(departureAirport, arrivalAirport, departureDate, arrivalDate, 651, "AB777", ACTIVE, null);
    }

    public static Segment oneWay2(AirportEnum departureAirport, AirportEnum arrivalAirport) {
        Calendar departureDate = new GregorianCalendar(2010, 2, 15);
        Calendar arrivalDate = new GregorianCalendar(2010, 6, 16);

        return new Segment(departureAirport, arrivalAirport, departureDate, arrivalDate, 651, "AB777", ACTIVE, null);
    }

    public static Segment segmentForSCAnalyzer(Calendar departureDate, Calendar arrivalDate, List<String> segmentInformation) {

        return new Segment(AirportEnum.GDN, AirportEnum.WAW, departureDate, arrivalDate, 651, "AB777", ACTIVE, segmentInformation);
    }
}
