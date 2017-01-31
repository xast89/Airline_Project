package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.structure.booking.Passenger;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSeeker {

    public static final String REGEX = "/";

    public String findMail(Passenger passenger){
        for (String passengerInformation : passenger.getPassengerInformation()) {
            if(passengerInformation.contains("mail")){
                passengerInformation.split(REGEX);

            }

        }

        return null;
    }
}
