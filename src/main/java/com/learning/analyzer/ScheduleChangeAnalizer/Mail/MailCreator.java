package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import com.learning.analyzer.ScheduleChangeAnalizer.Schedule.MessageCreator;
import com.learning.analyzer.ScheduleChangeAnalizer.activationCode.ActivationCodeCreator;
import com.learning.structure.booking.Booking;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class MailCreator {
    private MessageCreator messageCreator;
    private ActivationCodeCreator activationCodeCreator;

    public MailCreator() {
        this.messageCreator = new MessageCreator();
        this.activationCodeCreator = new ActivationCodeCreator();

    }
    public String preapreMessageToSend(Booking booking){
        String messageAboutCanceledFlight = messageCreator.createMessageAboutCanceledFlight(booking.getPassengerList().get(0).getSegmentList());
        String messageAboutNewFlight = messageCreator.createMessageAboutNewFlight(booking.getPassengerList().get(0).getSegmentList());
        String activationCode = activationCodeCreator.createActivationCode(booking.getPassengerList());

        String message = new String(messageAboutCanceledFlight + messageAboutNewFlight + ". Kod aktywacyjny nowego lotu to: " + activationCode);

        return message;
    }


}
