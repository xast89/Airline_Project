package com.learning.analyzer2.Segment;

import com.learning.structure.booking.Segment;

import java.util.Comparator;
import java.util.List;

/**
 * Created by franciszekdanes on 11.03.2017.
 */
public class SegmentSorter {

    //TODO: to jest mega fajne rozwiazanie.
    public void sortBy(List<Segment> segments, SegmentSortType type){
        switch (type) {
            case DEPARTURE_DATE:
                segments.sort(Comparator.comparing(Segment::getDepartureDate));
        }
    }
}
