package com.learning.analyzer.ageAnalizer;

/**
 * Created by Cyprian on 2017-01-17.
 */
//TODO: a czemu to nazwales analizer? Dla potrzeb projektu umowmy sie, ze tylko klaski implementujace Interface
    //TODO: Analyzer moga sie nazywac Analyzer
public class MonthAnalizer {

    //TODO: Camel style
    public int checkpassengerMonthBirthday(String month) throws NullPointerException{

        //TODO: nie jestem pewny, czy tutaj powinienes sprawdzac czy jest null. Moze wczesniej?
        //TODO: I ogolnie rzucanie 'NullPointerException' to nie jest najlepszy pomysl
        if(month==null)
            throw new NullPointerException("Miesiąc nie moze byc pusty");

        //TODO: private static final String JAN = "JAN";
        //TODO: Moze switch? Albo przynajmniej ifelse ?
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

        //TODO: Nie rozumiem. Jak ktos w miejsce miesiaca wpisze "HUJ" to Twoja metodka zwroci 0 i co dalej?
        return 0;
    }
}
