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
            if (isScheduleChange(booking)) {
                mailSender.sendEmailToAllPassangersFromCanceledSegment(przykladowyPrzygotowywacz.przygotujPaczke(booking));
                logger.info("Poszlo");
            } else {
                logger.info("Nie znaleziono zadnych anulowanych lotow.");
            }


        } else {
            logger.info("Nullowy booking! Nieakceptowalne!");
        }
    }

    private boolean isScheduleChange(Booking booking) {
        for (Passenger passenger : booking.getPassengerList()) {
            if (changedSchedule.isScheduleChangeSegment(passenger.getSegmentList())) {
                return true;
            }
        }
        return false;
    }
}

