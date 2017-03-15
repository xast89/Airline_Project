package com.learning.analyzer2.Date;

import java.util.Calendar;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

/**
 * Created by franciszekdanes on 15.03.2017.
 */
public class DateAnalyzer {
    public int getDifferenceBetween(Calendar calendar1,Calendar calendar2,DifferenceDateType differenceDateType){
        int difference = 0;

        switch (differenceDateType){
            case YEARS:
                Calendar[] calendars= {calendar1,calendar2};
                int year1 = calendar1.get(YEAR);
                int year2 = calendar2.get(YEAR);

                //Swap to allow pass date in any order(first can be smaller then second || second can be smaller then first)
                if(year1 > year2){
                    year1 = year1 ^ year2 ^ (year2 = year1);
                    calendars[0]= calendar2;
                    calendars[1]= calendar1;
                }

                difference = year2 - year1;

                if (calendars[0].get(MONTH) > calendars[1].get(MONTH) ||
                        (calendars[0].get(MONTH) == calendars[1].get(MONTH) &&
                                calendars[0].get(DATE) > calendars[1].get(DATE))) {
                    difference--;
                }
        }

        return difference;
    }
}
