package com.learning.analyzer.ageAnalizer.Month;

import static com.learning.analyzer.ageAnalizer.Month.MonthType.*;

/**
 * Created by Cyprian on 2017-01-17.
 */

public class Month {

    public int checkPassengerMonthBirthday(String month) {


        if (month.equals(JAN.name()))
            return 1;
        else if (month.equals(FEB.name()))
            return 2;
        else if (month.equals(MAR.name()))
            return 3;
        else if (month.equals(APR.name()))
            return 4;
        else if (month.equals(MAY.name()))
            return 5;
        else if (month.equals(AUG.name()))
            return 6;
        else if (month.equals(JUN.name()))
            return 7;
        else if (month.equals(JUL.name()))
            return 8;
        else if (month.equals(SEP.name()))
            return 9;
        else if (month.equals(OCT.name()))
            return 10;
        else if (month.equals(NOV.name()))
            return 11;
        else if (month.equals(DEC.name()))
            return 12;
        else {
            return 0;
        }


    }
}
