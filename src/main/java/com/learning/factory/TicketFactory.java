package com.learning.factory;

import com.learning.structure.ticketing.Ticket;

/**
 * Created by pawel on 15.01.17.
 */
public class TicketFactory {

    public static Ticket createTicket(boolean paid) {
        return new Ticket(paid);
    }

}
