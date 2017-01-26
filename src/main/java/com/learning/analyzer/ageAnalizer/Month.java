package com.learning.analyzer.ageAnalizer;

/**
 * Created by Cyprian on 2017-01-17.
 */

public class Month {

    public int checkPassengerMonthBirthday(String month) {

//TODO: miesiace do enuma
        if (month.equals("JAN"))
            return 1;
        else if (month.equals("FEB"))
            return 2;
        else if (month.equals("MAR"))
            return 3;
        else if (month.equals("APR"))
            return 4;
        else if (month.equals("MAY"))
            return 5;
        else if (month.equals("AUG"))
            return 6;
        else if (month.equals("JUN"))
            return 7;
        else if (month.equals("JUL"))
            return 8;
        else if (month.equals("SEP"))
            return 9;
        else if (month.equals("OCT"))
            return 10;
        else if (month.equals("NOV"))
            return 11;
        else if (month.equals("DEC"))
            return 12;
        else {
            System.out.println("Błędna nazwa miesiąca.");
            return 0;
        }
        //TODO: Nie rozumiem. Jak ktos w miejsce miesiaca wpisze "HUJ" to Twoja metodka zwroci 0 i co dalej?

    }
}
