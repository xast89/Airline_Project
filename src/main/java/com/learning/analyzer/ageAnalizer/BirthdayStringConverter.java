package com.learning.analyzer.ageAnalizer;

import com.learning.analyzer.ageAnalizer.Month.DateSpliter;
import com.learning.analyzer.ageAnalizer.Month.Month;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Integer.*;
import static java.util.Calendar.*;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class BirthdayStringConverter {


    public static final String REGEX = "/";
    private int actualYear;

    public BirthdayStringConverter() {
        actualYear=(getInstance().get(YEAR))-2000;
    }

    public Calendar convertPassengerBirthdayToInt(String passengerBirthdayFromPassport) {

        Month monthOfPassengerBirthday = new Month();
        DateSpliter dateSpliter = new DateSpliter();
        dateSpliter.splitPassengerinformation(passengerBirthdayFromPassport);

        if(isNotGoodSplitted(dateSpliter))
        {
            return null;
        }


        int intValueOfDay = valueOf(dateSpliter.getDay());
        int intValueOfMonth = monthOfPassengerBirthday.checkPassengerMonthBirthday(dateSpliter.getMonth());
            if(intValueOfMonth==0)
            {
                System.out.println("Bledny format daty w paszporcie.");

            }
                Calendar passengerGregorianCalendar = new GregorianCalendar(checkIfYearIsLeap(dateSpliter.getYear()), intValueOfMonth, intValueOfDay);
                return passengerGregorianCalendar;
    }

    private boolean isNotGoodSplitted(DateSpliter dateSpliter) {
        return dateSpliter.getDay() == null || dateSpliter.getMonth() == null || dateSpliter.getYear() == null;
    }


    private int checkIfYearIsLeap(String year){
        if(0<= parseInt(year) && parseInt(year)<=actualYear){
            int intValueOfYear = parseInt(year)+2000;
            return intValueOfYear;
        }
        int intValueOfYear = parseInt(year)+1900;;
        return intValueOfYear;
    }



}
