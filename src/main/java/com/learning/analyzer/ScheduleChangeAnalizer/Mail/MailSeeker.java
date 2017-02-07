package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.ChangedSchedule;
import com.learning.structure.booking.Passenger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSeeker {

    private MailSpliter mailSpliter;
    private ChangedSchedule changedSchedule;


    public MailSeeker() {
        this.mailSpliter = new MailSpliter();
        this.changedSchedule = new ChangedSchedule();
    }

    public String findMail(Passenger passenger) {
        if (changedSchedule.findSegmentInformation(passenger.getSegmentList())) {
            for (String passengerInformation : passenger.getPassengerInformation()) {
                if (passengerInformation.contains("mail"))
                    return mailSpliter.findMailInformatiom(passengerInformation);
            }
        }
        LOGGER.info("Bledny email");
        return null;
    }

}
