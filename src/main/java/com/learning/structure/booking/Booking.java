package com.learning.structure.booking;

import com.learning.structure.util.FlightStatus;

import java.util.List;

import static com.learning.structure.util.FlightStatus.ACTIVE;

/**
 * Created by pawel on 15.01.17.
 */
public class Booking {

    private List<Passenger> passengerList;
    private String pnrLocator;
    private FlightStatus flightStatus;

    public Booking(List<Passenger> passengerList, String pnrLocator, FlightStatus flightStatus) {
        this.passengerList = passengerList;
        this.pnrLocator = pnrLocator;
        this.flightStatus = flightStatus;
    }

    public boolean isActive() {
        return this.flightStatus == ACTIVE;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public String getPnrLocator() {
        return pnrLocator;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }
}
