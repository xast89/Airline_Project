package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSpliter {
    public static final String REGEX = "/";

    public String findMailInformatiom(String passengerInformation) {
        if (passengerInformation != null) {
            if (passengerInformation.contains(REGEX)) {
                String[] passengerMail = passengerInformation.split(REGEX);
                if (passengerMail[1].contains("@"))
                    return passengerMail[1];
            }
        }
        return null;
    }
}
