package com.learning.factory;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.structure.ticketing.Ticket;
import com.learning.structure.util.PassengerType;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import static com.learning.factory.SegmentFactory.*;
import static com.learning.structure.util.AirportEnum.*;

/**
 * Created by pawel on 15.01.17.
 */
public class PassengerFactory {

    public static final String SCHEDULE_CHANGE = "Schedule Change";
    public static final String OK = "OK";

    public static Passenger oneAdultOneWay() {
        String name = "Mike";
        String surname = "Bush";

        List<Segment> segments = Arrays.asList(oneWay(BER, KRK), oneWay2(BER, KRK));

        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/DE/123WXY/12JAN89/XPD/20JAN20"); //XPD INFORMACJA O KRAJU O ZMIENNEJ DLUGOSCI, DE tak samo.

        Ticket ticket = TicketFactory.createTicket(true);

        return new Passenger(name, surname, PassengerType.ADULT, segments, passengerInformation, ticket);

    }

    public static Passenger twoAdultoneWay() {

        String name = null;
        String surname = "Kowalski";

        List<Segment> segments = Arrays.asList(oneWay(WAW, KRK));

        List<String> passengerInformation = Arrays.asList(null, null); //XPD INFORMACJA O KRAJU O ZMIENNEJ DLUGOSCI, DE tak samo.

        Ticket ticket = TicketFactory.createTicket(true);

        return new Passenger(name, surname, PassengerType.ADULT, segments, passengerInformation, ticket);

    }

    public static Passenger threeAdultoneWay() {

        String name = "Marian";
        String surname = "Kowalski";

        List<Segment> segments = Arrays.asList(oneWay(WAW, KRK));

        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/DE/123WXY/12dup89/XPD/20JAN20");

        Ticket ticket = TicketFactory.createTicket(true);

        return new Passenger(name, surname, PassengerType.ADULT, segments, passengerInformation, ticket);

    }

    public static Passenger passengerForSCAnalyzer() {
        String name = "Jon";
        String surname = "Tower";

        List<Segment> segments =
                Arrays.asList(
                        segmentForSCAnalyzer(
                                new GregorianCalendar(2017, 5, 14),
                                new GregorianCalendar(2017, 5, 21),
                                Arrays.asList(SCHEDULE_CHANGE)),
                        segmentForSCAnalyzer(
                                new GregorianCalendar(2017, 5, 17),
                                new GregorianCalendar(2017, 5, 24),
                                Arrays.asList(OK)
                        ));

        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/DE/123WXY/12JAN08/XPD/20JAN20", "mail/cforemny@gmail.com");

        Ticket ticket = TicketFactory.createTicket(true);

        return new Passenger(name, surname, PassengerType.ADULT, segments, passengerInformation, ticket);

    }

    public static Passenger passengerForSCAnalyzerTwo() {
        String name = "Paul";
        String surname = "Gondek";

        List<Segment> segments =
                Arrays.asList(
                        segmentForSCAnalyzer(
                                new GregorianCalendar(2017, 5, 14),
                                new GregorianCalendar(2017, 5, 21),
                                Arrays.asList(SCHEDULE_CHANGE)),
                        segmentForSCAnalyzer(
                                new GregorianCalendar(2017, 5, 17),
                                new GregorianCalendar(2017, 5, 24),
                                Arrays.asList(OK)
                        ));

        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/DE/123WXY/12JAN08/XPD/20JAN20", "mail/pawel.gondek@gmail.com ");

        Ticket ticket = TicketFactory.createTicket(true);

        return new Passenger(name, surname, PassengerType.ADULT, segments, passengerInformation, ticket);

    }
}
