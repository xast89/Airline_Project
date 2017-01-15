package com.learning.structure.ticketing;

/**
 * Created by pawel on 15.01.17.
 */
public class Ticket {

    private boolean isPaid;

    public Ticket(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
