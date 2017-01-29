package com.learning.analyzer.ageAnalizer.Segment;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;

import java.util.Collections;

/**
 * Created by Cyprian on 2017-01-25.
 */
public class ActiveSegment {

    private SegmentSorter segmentSorter;

    public ActiveSegment() {
        this.segmentSorter = new SegmentSorter();
    }

    public Segment findActiveSegment(Passenger passenger) {


        Collections.sort(passenger.getSegmentList(), segmentSorter);

        for (Segment segment : passenger.getSegmentList()) {
            if (segment.isActive()) {
                return segment;
            }
        }
        return null;

    }
}
