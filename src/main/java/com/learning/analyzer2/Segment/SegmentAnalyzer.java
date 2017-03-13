package com.learning.analyzer2.Segment;

import com.learning.structure.booking.Segment;
import java.util.List;

/**
 * Created by fd on 11.03.2017.
 */
public class SegmentAnalyzer {

    private Segment getActiveSegment(List<Segment> segments){

        for (Segment segment: segments) {
            if(segment.isActive()) return segment;
        }
        return null;
    }

    public Segment getNearestActiveSegment(List<Segment> segments){
        return getActiveSegment(segments);
    }
}
