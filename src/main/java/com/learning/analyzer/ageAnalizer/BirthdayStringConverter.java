package com.learning.analyzer.ageAnalizer;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class BirthdayStringConverter {

    public BirthdayStringConverter() {
    }

    public Calendar convertPassengerBirthdayToInt(String s) {

        if(countSpecifiedChars(s)) {
            String[] passportInfromation;
            int actualYear = (Calendar.getInstance().get(Calendar.YEAR))-2000;
            MonthAnalizer monthAnalizer = new MonthAnalizer();
            passportInfromation = s.split("/");
            String day = passportInfromation[4].substring(0, 2);
            String month = passportInfromation[4].substring(2, 5);
            String year = passportInfromation[4].substring(5, 7);
            int day1 = Integer.valueOf(day);
            int year1;
            int month1 = monthAnalizer.checkpassengerMonthBirthday(month);
            if(0<=Integer.parseInt(year) && Integer.parseInt(year)<=actualYear){
                year1 = Integer.parseInt(year)+2000;
            }else
            {
                year1 = Integer.parseInt(year)+1900;
            }
            Calendar passengerGregorianCalendar = new GregorianCalendar(year1, month1, day1);
            //System.out.println("Data urodzenia pasażera to: " + passengerGregorianCalendar.get(Calendar.YEAR) + "." + passengerGregorianCalendar.get(Calendar.MONTH) + "." + passengerGregorianCalendar.get(Calendar.DAY_OF_MONTH));
            return passengerGregorianCalendar;
        }else
            return null;

    }

    private boolean countSpecifiedChars(String s){
        int length = s.length();
        int breaksCounter=0;
        for(int i=0 ;i< length;i++){
            char c = s.charAt(i);
            if(c=='/'){
                breaksCounter++;
            }
        }
        if(breaksCounter<6)
            return false;
        return true;
    }
}
