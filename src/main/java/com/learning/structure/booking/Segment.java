package com.learning.structure.booking;

import com.learning.structure.util.AirportEnum;
import com.learning.structure.util.FlightStatus;

import java.util.Calendar;

import static com.learning.structure.util.FlightStatus.*;

/**
 * Created by pawel on 15.01.17.
 */
public class Segment {

    private AirportEnum arrivalAirport;
    private AirportEnum departureAirport;
    private Calendar departureDate;
    private Calendar arrivalDate;
    private int flightNumber;
    private String equipment;
    private FlightStatus flightStatus;

    public Segment(AirportEnum departureAirport, AirportEnum arrivalAirport, Calendar departureDate, Calendar arrivalDate, int flightNumber, String equipment, FlightStatus flightStatus) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.flightNumber = flightNumber;
        this.equipment = equipment;
        this.flightStatus = flightStatus;
    }

    public boolean isActive() {
        return this.flightStatus == ACTIVE;
    }

    public AirportEnum getArrivalAirport() {
        return arrivalAirport;
    }

    public AirportEnum getDepartureAirport() {
        return departureAirport;
    }

    public Calendar getDepartureDate() {
        return departureDate;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getEquipment() {
        return equipment;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }
}
