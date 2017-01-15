package com.learning.factory;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;
import com.learning.structure.ticketing.Ticket;
import com.learning.structure.util.AirportEnum;
import com.learning.structure.util.PassengerType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pawel on 15.01.17.
 */
public class PassengerFactory {

    public static Passenger oneAdultOneWay()
    {
        String name = "Mike";
        String surname = "Bush";

        List<Segment> segments = Arrays.asList(SegmentFactory.oneWay(AirportEnum.BER, AirportEnum.KRK));

        List<String> passengerInformation = Arrays.asList("ADD/IXIS2/8989", "DOC/PAS/DE/123WXY/12JAN89");

        Ticket ticket = TicketFactory.createTicket(true);

        return new Passenger(name,surname, PassengerType.ADULT, segments, passengerInformation, ticket);

    }
}
