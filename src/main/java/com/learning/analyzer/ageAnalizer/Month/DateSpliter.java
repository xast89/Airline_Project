package com.learning.analyzer.ageAnalizer.Month;

/**
 * Created by Cyprian on 2017-01-26.
 */
public class DateSpliter {
    private String day;
    private String month;
    private String year;
    public static final String REGEX = "/";

    public String getDay() {
        return day;
    }
    public String getMonth() {
        return month;
    }
    public String getYear() {
        return year;
    }

    public String splitPassengerinformation(String passengerBirthdayFromPassport) {
        if (countSpecifiedChars(passengerBirthdayFromPassport)) {
            String[] passportInformation;
            passportInformation = passengerBirthdayFromPassport.split(REGEX);
            this.day = passportInformation[4].substring(0, 2);
            this.month = passportInformation[4].substring(2, 5);
            this.year = passportInformation[4].substring(5, 7);
        }
        return null;
    }

    private boolean countSpecifiedChars(String passportBirthdayInformation) {
        int length = passportBirthdayInformation.length();
        int breaksCounter = 0;
        for (int i = 0; i < length; i++) {
            char c = passportBirthdayInformation.charAt(i);
            if (c == '/') {
                breaksCounter++;
            }
        }
        if (breaksCounter < 6)
            return false;
        return true;
    }
}
