package com.learning.analyzer.ageAnalizer.Month;

/**
 * Created by Cyprian on 2017-01-17.
 */

public class Month {

    public int checkPassengerMonthBirthday(String month) {


        if (month.equals(MonthType.JAN.name()))
            return 1;
        else if (month.equals(MonthType.FEB.name()))
            return 2;
        else if (month.equals(MonthType.MAR.name()))
            return 3;
        else if (month.equals(MonthType.APR.name()))
            return 4;
        else if (month.equals(MonthType.MAY.name()))
            return 5;
        else if (month.equals(MonthType.AUG.name()))
            return 6;
        else if (month.equals(MonthType.JUN.name()))
            return 7;
        else if (month.equals(MonthType.JUL.name()))
            return 8;
        else if (month.equals(MonthType.SEP.name()))
            return 9;
        else if (month.equals(MonthType.OCT.name()))
            return 10;
        else if (month.equals(MonthType.NOV.name()))
            return 11;
        else if (month.equals(MonthType.DEC.name()))
            return 12;
        else {
             return 0;
        }


    }
}
