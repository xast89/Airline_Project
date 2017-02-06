package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.factory.BookingFactory;
import com.learning.structure.booking.Booking;

import java.util.List;

/**
 * Created by Cyprian on 2017-02-06.
 */
public class EmailListAsString {

    private Booking booking;
    private EmailList emailList;
    private List<String> emailAdressesList;
    private StringBuilder list;

    public EmailListAsString() {
        this.booking = BookingFactory.createBookingForSCAnalyzer();
        this.emailList = new EmailList();
        this.emailAdressesList = emailList.createEmailAdressesList(booking);
        this.list = new StringBuilder();
    }

    public String createAdresses() {

        for (String adress : emailAdressesList) {
            list.append(adress);
            list.append(", ");
        }
        String stringAdressesList = list.toString();
        return stringAdressesList;
    }
}
