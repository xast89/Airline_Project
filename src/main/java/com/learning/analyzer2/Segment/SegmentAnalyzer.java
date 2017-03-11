package com.learning.analyzer2.Segment;

import com.learning.structure.booking.Segment;
import java.util.List;

/**
 * Created by fd on 11.03.2017.
 */
public class SegmentAnalyzer {

    private Segment getActiveSegment(List<Segment> segments){
        Segment segment = null;
        for (Segment s: segments) {
            if(s.isActive()){
                segment = s;
                break;
            }
        }
        return segment;
    }

    public Segment getNearestActiveSegment(List<Segment> segments){
        Segment segment;
        SegmentSorter segmentSorter = new SegmentSorter();
        segmentSorter.sortBy(segments,SegmentSortType.DEPARTURE_DATE);
        segment = getActiveSegment(segments);

        return segment;
    }
}
