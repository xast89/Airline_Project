package com.learning.analyzer.ageAnalizer.Segment;

import com.learning.structure.booking.Segment;

import java.util.Calendar;
import java.util.Comparator;

/**
 * Created by Cyprian on 2017-01-29.
 */
public class SegmentSorter implements Comparator<Segment> {


    @Override
    public int compare(Segment segment1, Segment segment2) {

        Calendar departureDateFromSegment1 = segment1.getDepartureDate();
        Calendar departureDateFromSegment2 = segment2.getDepartureDate();

        long dateSubstraction = departureDateFromSegment1.getTimeInMillis() - departureDateFromSegment2.getTimeInMillis();

        if (dateSubstraction < 0) {
            return -1;
        } else if (dateSubstraction == 0) {
            return 0;
        } else
            return 1;
    }
}
