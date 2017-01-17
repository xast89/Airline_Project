package com.learning.analyzer.ageAnalizer;

/**
 * Created by Cyprian on 2017-01-17.
 */
public class MonthAnalizer {

    public static int checkpassengerMonthBirthday(String month){

        if(month.equals("JAN"))
            return 1;
        if(month.equals("FEB"))
            return 2;
        if(month.equals("MAR"))
            return 3;
        if(month.equals("APR"))
            return 4;
        if(month.equals("MAY"))
            return 5;
        if(month.equals("AUG"))
            return 6;
        if(month.equals("JUN"))
            return 7;
        if(month.equals("JUL"))
            return 8;
        if(month.equals("SEP"))
            return 9;
        if(month.equals("OCT"))
            return 10;
        if(month.equals("NOV"))
            return 11;
        if(month.equals("DEC"))
            return 12;

        return 0;
    }
}
