package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailSender;
import com.learning.analyzer.util.Analyzer;
import com.learning.structure.booking.Booking;

/**
 * Created by Cyprian on 2017-02-07.
 */
public class ScheduleChangeAnalyzer implements Analyzer {

    private MailSender mailSender;

    public ScheduleChangeAnalyzer() {
        this.mailSender = new MailSender();
    }

    @Override
    public void analyze(Booking booking) {

        mailSender.preapreAndSendEmailToAllPassangersFromCanceledSegment(booking);

    }
}
