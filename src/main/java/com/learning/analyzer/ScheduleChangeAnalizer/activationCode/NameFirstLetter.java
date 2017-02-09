package com.learning.analyzer.ScheduleChangeAnalizer.activationCode;

import com.learning.structure.booking.Passenger;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class NameFirstLetter {

    public char getFirstletterOfPassengersName(Passenger passenger) {
        String name = passenger.getName();
        if (name != null)
            return name.charAt(0);
        else
            return 0; //zrobilem tak tylko zeby miec tez test dla nulla. Zgodnie z zalozeniem booking jest ok i nie powinno byc psutego pola.

    }
}
