package com.learning.factory;

import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.util.FlightStatus;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pawel on 15.01.17.
 */
public class BookingFactory {

    public static Booking createOneAdultOneWay()
    {
        List<Passenger> passengers = Arrays.asList(PassengerFactory.oneAdultOneWay());

        return new Booking(passengers, "PIXJTS", FlightStatus.ACTIVE);
    }

    public static Booking createTwoAdultOneWay()
    {
        List<Passenger> passengers = Arrays.asList(PassengerFactory.twoAdultoneWay());

        return new Booking(passengers, null, FlightStatus.ACTIVE);
    }
    public static Booking createThreeAdultOneWay()
    {
        List<Passenger> passengers = Arrays.asList(PassengerFactory.threeAdultoneWay());

        return new Booking(passengers, null, FlightStatus.ACTIVE);
    }


}
