package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.structure.booking.Segment;

import java.util.List;

/**
 * Created by Cyprian on 2017-02-07.
 */
public class AlternativeSchedule {


    public static final String OK = "OK";

    public boolean findAlternativeSegmentInformation(List<Segment> segmentList) {
        for (Segment segment : segmentList) {

            for (String segmenInformation : segment.getSegmentInformation()) {
                if (segmenInformation.equals(OK)) {
                    return true;
                }
            }

        }
        return false;

    }


}
