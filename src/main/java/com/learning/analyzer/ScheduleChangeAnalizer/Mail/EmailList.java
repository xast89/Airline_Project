package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.structure.booking.Booking;
import com.learning.structure.booking.Passenger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2017-02-06.
 */
public class EmailList {

    private MailSeeker mailSeeker;


    public EmailList() {
        this.mailSeeker = new MailSeeker();
    }

    public List<String> createEmailAdressesList(Booking booking) {
        List<String> emailAdressesList = new ArrayList<>();
        for (Passenger passenger : booking.getPassengerList()) {
            emailAdressesList.add(mailSeeker.findMail(passenger));
        }

        return emailAdressesList;
    }
}
