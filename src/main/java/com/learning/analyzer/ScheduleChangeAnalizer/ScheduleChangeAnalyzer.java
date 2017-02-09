package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSender;
import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;
import org.apache.log4j.Logger;

/**
 * Created by Cyprian on 2017-02-07.
 */
public class ScheduleChangeAnalyzer implements Analyzer {

    private MailSender mailSender;
    private Logger logger = Logger.getLogger(ScheduleChangeAnalyzer.class);

    public ScheduleChangeAnalyzer() {
        this.mailSender = new MailSender();
    }

    @Override
    public void analyze(Booking booking) {

        if (booking != null) {
            mailSender.preapreAndSendEmailToAllPassangersFromCanceledSegment(booking);
            logger.info("Poszlo");

        } else {
            logger.info("Nullowy booking! Nieakceptowalne!");
            return;
        }


    }
}
