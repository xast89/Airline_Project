package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.structure.booking.Segment;

import java.util.Calendar;
import java.util.List;

import static java.util.Calendar.*;

/**
 * Created by Cyprian on 2017-02-07.
 */
public class MessageCreator {

    private ChangedSchedule changedSchedule;
    private AlternativeSchedule alternativeSchedule;

    public MessageCreator() {
        this.changedSchedule = new ChangedSchedule();
        this.alternativeSchedule = new AlternativeSchedule();
    }

    public String createMessageAboutNewdFlight(List<Segment> segmentList) {

        for (Segment segment : segmentList) {

            if (alternativeSchedule.findAlternativeSegmentInformation(segmentList)) {
                String newFlight = " lot numer " + segment.getFlightNumber() + " z " +
                        segment.getDepartureAirport() + " do " + segment.getArrivalAirport() + " w dniu " +
                        segment.getDepartureDate().get(MONTH)+"."+segment.getDepartureDate().get(DAY_OF_MONTH);
                return newFlight;
            }
        }
        return null;


    }

    public String createMessageAboutCanceledFlight(List<Segment> segmentList) {

        for (Segment segment : segmentList) {
            if (changedSchedule.findSegmentInformation(segmentList)) {
                String canceledFlight = "Odwoloano lot numer " + segment.getFlightNumber() + " z " +
                        segment.getDepartureAirport() + " do " + segment.getArrivalAirport() + " z dnia " + segment.getDepartureDate().get(MONTH)+"."+
                        segment.getDepartureDate().get(DAY_OF_MONTH) + ". W jego miejsce można będzie skorzystać z lotu zastępczego:";
                return canceledFlight;
            }
        }
        return null;


    }
}


