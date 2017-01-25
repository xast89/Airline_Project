package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import com.learning.structure.booking.Segment;

import java.util.List;

/**
 * Created by Cyprian on 2017-01-25.
 */
public class ActiveSegment {

    public Segment  findActiveSegment(List<Segment> segmentList, Passenger passenger){
        for (Segment segment : passenger.getSegmentList() ) {
            if(segment.isActive()){
                return segment;
            }

        }

        return null;
    }
}
