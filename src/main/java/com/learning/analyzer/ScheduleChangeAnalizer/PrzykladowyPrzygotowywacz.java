package com.learning.analyzer.ScheduleChangeAnalizer;

import com.learning.analyzer.ScheduleChangeAnalizer.Mail.EmailListAsString;
import com.learning.analyzer.ScheduleChangeAnalizer.Mail.MailCreator;
import com.learning.structure.booking.Booking;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class PrzykladowyPrzygotowywacz {


    private EmailListAsString emailListAsString;
    private MailCreator mailCreator;

    public PrzykladowyPrzygotowywacz() {
        this.emailListAsString = new EmailListAsString();
        this.mailCreator = new MailCreator();
    }

    public  Wrapper przygotujPaczke(Booking booking){

        return new Wrapper(emailListAsString.createAdresses(booking),"Tytuł wiadomości", mailCreator.preapreMessageToSend(booking));

    }
}
