package com.learning.analyzer.activationCode;

import com.learning.structure.booking.Passenger;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class NameFirstLetter {

    public char getFirstletterOfPassengersName(Passenger passenger){
        String name = passenger.getName();
        return name.charAt(0);

    }
}
