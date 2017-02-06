package com.learning.factory;

import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import com.learning.structure.util.FlightStatus;

import java.util.Arrays;
import java.util.List;

import static com.learning.factory.PassengerFactory.*;

/**
 * Created by pawel on 15.01.17.
 */
public class BookingFactory {

    public static Booking createOneAdultOneWay() {
        List<Passenger> passengers = Arrays.asList(oneAdultOneWay());

        return new Booking(passengers, "PIXJTS", FlightStatus.ACTIVE);
    }

    public static Booking createTwoAdultOneWay() {
        List<Passenger> passengers = Arrays.asList(twoAdultoneWay());

        return new Booking(passengers, null, FlightStatus.ACTIVE);
    }

    public static Booking createThreeAdultOneWay() {
        List<Passenger> passengers = Arrays.asList(threeAdultoneWay());

        return new Booking(passengers, null, FlightStatus.ACTIVE);
    }

    public static Booking createBookingForSCAnalyzer() {
        List<Passenger> passengers = Arrays.asList(passengerForSCAnalyzer(), passengerForSCAnalyzerTwo(), passengerForSCAnalyzer());

        return new Booking(passengers, "BUX1234", FlightStatus.ACTIVE);
    }


}
