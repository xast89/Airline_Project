package com.learning.structure.booking;

import com.learning.structure.ticketing.Ticket;
import com.learning.structure.util.PassengerType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pawel on 15.01.17.
 */
public class Passenger {

    private String name;
    private String lastName;
    private PassengerType passengerType;
    private List<Segment> segmentList;
    private List<String> passengerInformation;
    private Map<String, Object> resultMap;
    private Ticket ticket;

    public Passenger(String name, String lastName, PassengerType passengerType, List<Segment> segmentList, List<String> passengerInformation, Ticket ticket) {
        this.name = name;
        this.lastName = lastName;
        this.passengerType = passengerType;
        this.segmentList = segmentList;
        this.passengerInformation = passengerInformation;
        this.ticket = ticket;
        this.resultMap = new HashMap<>();
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Segment> getSegmentList() {
        return segmentList;
    }

    public List<String> getPassengerInformation() {
        return passengerInformation;
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
