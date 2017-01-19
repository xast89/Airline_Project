//package com.learning.analyzer.ageAnalizer;
//
//import com.learning.factory.SegmentFactory;
//import com.learning.structure.booking.Passenger;
//import com.learning.structure.booking.Segment;
//import com.learning.structure.util.AirportEnum;
//import org.joda.time.DateTime;
//import org.joda.time.Days;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//@RunWith(PowerMockRunner.class)
////@RunWith(MockitoJUnitRunner.class)
///**
// * Created by Cyprian on 2017-01-19.
// */
//public class AgeAtSegmentTest {
//
//    @InjectMocks
//    private AgeAtSegment ageAtSegment;
//
//    @Mock
//    private Passenger passenger;
//    @Mock
//    private Calendar calendar;
//    @Mock
//    private Segment segment;
//    @Mock
//    Days days;
//
//    @Test
//    public void testCheckAgeAtSegments() {
//
//        //given
//        // Mockito.when(passenger.getPassengerInformation().get(1)).thenReturn("DOC/PAS/DE/123WXY/20JUN89/XPD/20JAN20");
////        // Mockito.when(passenger.getSegmentList()).thenReturn(segmentsInformation());
////        Mockito.when(calendar.get(Calendar.YEAR)).thenReturn(2016);
////        Mockito.when(calendar.get(Calendar.MONTH)).thenReturn(1);
////        Mockito.when(calendar.get(Calendar.DAY_OF_MONTH)).thenReturn(10);
////        Mockito.when(segment.getDepartureDate().get(Calendar.YEAR)).thenReturn(2016);
////        Mockito.when(segment.getDepartureDate().get(Calendar.MONTH)).thenReturn(1);
////        Mockito.when(segment.getDepartureDate().get(Calendar.DAY_OF_MONTH)).thenReturn(20);
//        DateTime dateTime = new DateTime(2016, 1, 10, 0, 0, 0, 0);
//        DateTime dateTime1 = new DateTime(2016, 1, 20, 0, 0, 0, 0);
//
//        Mockito.when(days.daysBetween(dateTime, dateTime1).getDays()).thenReturn(10);
//        //when
//        int result = ageAtSegment.checkAgeAtSegments(passenger, calendar);
//        //then
//        assertEquals(10, result);
//    }
//
//    private List<Segment> segmentsInformation() {
//        List<Segment> segments = Arrays.asList(SegmentFactory.oneWay(AirportEnum.BER, AirportEnum.KRK));
//        return segments;
//    }
//
//}