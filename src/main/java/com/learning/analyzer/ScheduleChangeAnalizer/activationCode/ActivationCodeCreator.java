package com.learning.analyzer.ScheduleChangeAnalizer.activationCode;

import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.ChangedSchedule;
import com.learning.structure.booking.Passenger;

import java.util.List;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class ActivationCodeCreator {


    private ChangedSchedule changedSchedule;
    private NameFirstLetter nameFirstLetter;
    private StringBuilder activationCode;


    public ActivationCodeCreator() {
        this.changedSchedule = new ChangedSchedule();
        this.nameFirstLetter = new NameFirstLetter();
        this.activationCode = new StringBuilder();
    }

    public String createActivationCode(List<Passenger> passengerList) {

        for (Passenger passenger : passengerList) {
            if (changedSchedule.findSegmentInformation(passenger.getSegmentList())) {
                char firstLetterOfPassengersName = nameFirstLetter.getFirstletterOfPassengersName(passenger);
                activationCode.append(firstLetterOfPassengersName);

            }

        }
        String activationCodeAsString = activationCode.toString();
        return activationCodeAsString;
    }
}
