package com.learning.analyzer2.Passenger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.apache.log4j.Logger;


/**
 * Created by fd on 02.03.2017.
 */
class PassengerInfoAnalyzer {
    private PassengerInfo passengerInfo = new PassengerInfo();
    private static final String splitRegex = "/";
    private static final String datePattern = "ddMMMyy";
    private static Logger log = Logger.getLogger(PassengerInfoAnalyzer.class.getName());

    PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    void createInfo(String passengerInformation){
        try{
            String[] data = passengerInformation.split(splitRegex);
            passengerInfo.setDataSource(data[0]);
            passengerInfo.setDataSourceType(data[1]);
            passengerInfo.setCountry(data[2]);
            passengerInfo.setDataSourceIdNr(data[3]);
            DateFormat dateFormat = new SimpleDateFormat(datePattern, Locale.ENGLISH);
            passengerInfo.setDirthdayDate(dateFormat.parse(data[4]));
            passengerInfo.setRandomData(data[5]);
            passengerInfo.setExpirationDate(dateFormat.parse(data[6]));
        }catch(ParseException e){
            log.error("Error while creating object containing info about passenger.");
            e.printStackTrace();
        }
    }
}
