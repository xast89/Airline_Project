package com.learning.analyzer.ScheduleChangeAnalizer.Schedule;

import com.learning.structure.booking.Segment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import static com.learning.factory.SegmentFactory.segmentForSCAnalyzer;
import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-02-07.
 */
public class MessageCreatorTest {

    @InjectMocks
    private MessageCreator messageCreator;
    public static final String SCHEDULE_CHANGE = "Schedule Change";

    @Mock
    private List<Segment> segmentList;
    @Mock
    private AlternativeSchedule alternativeSchedule;
    @Mock
    private ChangedSchedule changedSchedule;


    @Test
    public void createMessageAboutNewFlightWhenScheduleIsOk()  {
        //given
        segmentList=createSegmentList();
        Mockito.when(alternativeSchedule.findAlternativeSegmentInformation(segmentList)).thenReturn(true);
        //when
        String result = messageCreator.createMessageAboutNewFlight(segmentList);
        //then
        assertEquals(" lot numer 651 z GDN do WAW w dniu 5.14",result);


    }
    @Test
    public void createMessageAboutNewFlightWhenScheduleIsNotOk()  {
        //given
        segmentList=createSegmentList();
        Mockito.when(changedSchedule.findSegmentInformation(segmentList)).thenReturn(false);
        //when
        String result = messageCreator.createMessageAboutNewFlight(segmentList);
        //then
        assertEquals(null,result);


    }

    @Test
    public void createMessageAboutCanceledFlightWhenScheduleIsNotOk()  {
        //given
        segmentList=createSegmentList();
        Mockito.when(alternativeSchedule.findAlternativeSegmentInformation(segmentList)).thenReturn(false);
        //when
        String result = messageCreator.createMessageAboutNewFlight(segmentList);
        //then
        assertEquals(null,result);

    }

    @Test
    public void createMessageAboutCanceledFlightWhenScheduleIsOk()  {
        //given
        segmentList=createSegmentList();
        Mockito.when(alternativeSchedule.findAlternativeSegmentInformation(segmentList)).thenReturn(true);
        //when
        String result = messageCreator.createMessageAboutNewFlight(segmentList);
        //then
        assertEquals(" lot numer 651 z GDN do WAW w dniu 5.14",result);

    }

    private List<Segment> createSegmentList() {
        return Arrays.asList(
                segmentForSCAnalyzer(
                        new GregorianCalendar(2017, 5, 14),
                        new GregorianCalendar(2017, 5, 21),
                        Arrays.asList(SCHEDULE_CHANGE))

                );
    }

}