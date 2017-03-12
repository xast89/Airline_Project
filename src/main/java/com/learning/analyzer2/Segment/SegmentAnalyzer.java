package com.learning.analyzer2.Segment;

import com.learning.structure.booking.Segment;
import java.util.List;

/**
 * Created by fd on 11.03.2017.
 */
public class SegmentAnalyzer {

    private Segment getActiveSegment(List<Segment> segments){
        //TODO: po co przypisywac nulla?
        Segment segment = null;
        //TODO: co to jest 's'?
        for (Segment s: segments) {
            if(s.isActive()){
                //TODO: 1) Nie lepiej: return s; .....
                segment = s;
                break;
            }
        }
        //TODO: 1) .... a tutaj return null;?
        return segment;
    }

    //TODO: tutaj jest drobne niedopowiedzenie. Bo ta metoda sortuje segmenty i wzwraca najblizszy aktywny.
    //TODO: 1) To albo zmien nazwe (uwzglednij ze sortujesz segmenty) 2) albo sortuj gdzies indziej (np wczesniej)
    public Segment getNearestActiveSegment(List<Segment> segments){
        Segment segment;
        //new SegmentSorter(); - to nie powinno tutaj być
        SegmentSorter segmentSorter = new SegmentSorter();
        segmentSorter.sortBy(segments,SegmentSortType.DEPARTURE_DATE);

        //TODO: dajesz mozliwosc, ze kod wzroci Ci null'a - bronisz sie jakos przed tym?
        segment = getActiveSegment(segments);

        return segment;
    }
}
