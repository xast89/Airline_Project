package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSender;
import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.ChangedSchedule;
import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;
import org.apache.log4j.Logger;

/**
 * Created by Cyprian on 2017-02-07.
 */
public class ScheduleChangeAnalyzer implements Analyzer {

    private MailSender mailSender;
    private Logger logger = Logger.getLogger(ScheduleChangeAnalyzer.class);
    private PrzykladowyPrzygotowywacz przykladowyPrzygotowywacz;
    private ChangedSchedule changedSchedule;

    public ScheduleChangeAnalyzer() {
        this.mailSender = new MailSender();
        this.przykladowyPrzygotowywacz = new PrzykladowyPrzygotowywacz();
        this.changedSchedule = new ChangedSchedule();
    }

    @Override
    public void analyze(Booking booking) {
        if (booking != null) {
            for (Passenger passenger : booking.getPassengerList()) {
                if (changedSchedule.findSegmentInformation(passenger.getSegmentList())) {
                    Wrapper wrapper = przykladowyPrzygotowywacz.przygotujPaczke(booking);

                    mailSender.preapreAndSendEmailToAllPassangersFromCanceledSegment(wrapper);
                    logger.info("Poszlo");
                    return;
                } else
                    logger.info("Nie znaleziono zadnych anulowanych lotow.");
            }

        } else {
            logger.info("Nullowy booking! Nieakceptowalne!");
         }
    }
}

