package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSpliter {

    private static final String REGEX = "/";

    public String findMailInformatiom(String passengerInformation) {
        if (passengerInformation != null) {
            if (passengerInformation.contains(REGEX)) {
                String[] passengerMail = passengerInformation.split(REGEX);
                if (passengerMail[1].contains("@"))
                    return passengerMail[1];
            }
        }
        LOGGER.info("Wslalano maila");
        return null;
    }
}
