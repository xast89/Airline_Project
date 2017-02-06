package com.learning.structure.booking;

import com.learning.structure.util.AirportEnum;
import com.learning.structure.util.FlightStatus;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.learning.structure.util.FlightStatus.ACTIVE;

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
    private List<String> segmentInformation;
    private Map<String, Object> resultMap;

    public Segment(AirportEnum departureAirport, AirportEnum arrivalAirport, Calendar departureDate, Calendar arrivalDate, int flightNumber, String equipment, FlightStatus flightStatus, List<String> segmentInformation) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.flightNumber = flightNumber;
        this.equipment = equipment;
        this.flightStatus = flightStatus;
        this.segmentInformation = segmentInformation;
        this.resultMap = new HashMap<>();
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

    public void setArrivalAirport(AirportEnum arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureAirport(AirportEnum departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }

    public void setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public List<String> getSegmentInformation() {
        return segmentInformation;
    }

    public void setSegmentInformation(List<String> segmentInformation) {
        this.segmentInformation = segmentInformation;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }
}
