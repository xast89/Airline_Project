package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSpliter;
import com.learning.structure.booking.Passenger;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSeeker {

    private MailSpliter mailSpliter;

    public MailSeeker() {
        this.mailSpliter = new MailSpliter();
    }

    public String findMail(Passenger passenger) {
        for (String passengerInformation : passenger.getPassengerInformation()) {
            if (passengerInformation.contains("mail"))
                return mailSpliter.findMailInformatiom(passengerInformation);
        }
        return null;
    }

}
