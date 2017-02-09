package com.learning.analyzer.activationCode;

import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.ChangedSchedule;
import com.learning.structure.booking.Passenger;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class ActivationCodeCreator {



    private ChangedSchedule changedSchedule;
    private NameFirstLetter nameFirstLetter;

    public ActivationCodeCreator() {
        this.changedSchedule = new ChangedSchedule();
        this.nameFirstLetter = new NameFirstLetter();
    }

    public void createActivationCode(List <Passenger> passengerList){

        for (Passenger passenger : passengerList) {
            if(changedSchedule.findSegmentInformation(passenger.getSegmentList())){
                char firstletterOfPassengersName = nameFirstLetter.getFirstletterOfPassengersName(passenger);
                System.out.println(firstletterOfPassengersName);
            }

        }

    }
}
