package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.structure.booking.Segment;

/**
 * Created by Cyprian on 2017-02-01.
 */
public class ScheduleChecker {

    public static final String SCHEDULE_CHANGE = "Schedule Change";

    public boolean findSegmentInformation(Segment segment) {

        for (String segmenInformation : segment.getSegmentInformation()) {
            if (segmenInformation.equals(SCHEDULE_CHANGE)) {
                return true;
            }
        }

        return false;

    }
}
