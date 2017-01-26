package com.learning.analyzer.ageAnalizer;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class BirthdayStringConverter {


    public static final String REGEX = "/";

    public BirthdayStringConverter() {
    }

    public Calendar convertPassengerBirthdayToInt(String passengerBirthdayFromPassport) {

        if(countSpecifiedChars(passengerBirthdayFromPassport)) {
            String[] passportInformation;
            int actualYear = (getInstance().get(YEAR))-2000;
            Month monthAnalizer = new Month();
            passportInformation = passengerBirthdayFromPassport.split(REGEX);
            String day = passportInformation[4].substring(0, 2);
            String month = passportInformation[4].substring(2, 5);
            String year = passportInformation[4].substring(5, 7);
// TODO: test jak month zly
            int intValueOfDay = Integer.valueOf(day);
            int intValueOfYear;
            int intValueOfMonth = monthAnalizer.checkPassengerMonthBirthday(month);
            if(0<=Integer.parseInt(year) && Integer.parseInt(year)<=actualYear){
                intValueOfYear = Integer.parseInt(year)+2000;
            }else
            {
                intValueOfYear = Integer.parseInt(year)+1900;
            }
            Calendar passengerGregorianCalendar = new GregorianCalendar(intValueOfYear, intValueOfMonth, intValueOfDay);
            return passengerGregorianCalendar;
        }else
            //TODO: nie zwracamy null
            return null;

    }


    private boolean countSpecifiedChars(String passportBirthdayInformation){
        int length = passportBirthdayInformation.length();
        int breaksCounter=0;
        for(int i=0 ;i< length;i++){
            char c = passportBirthdayInformation.charAt(i);
            if(c=='/'){
                breaksCounter++;
            }
        }
        if(breaksCounter<6)
            return false;
        return true;
    }
}
