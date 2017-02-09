package com.learning.analyzer.ScheduleChangeAnalizer.activationCode;

import com.learning.structure.booking.Passenger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
/**
 * Created by Cyprian on 2017-02-09.
 */
public class NameFirstLetterTest {

    private static final char firstLetter = 'B';
    private static final char firstLetterNull = 0;
    @InjectMocks
    private NameFirstLetter nameFirstLetter;
    @Mock
    private Passenger passenger;

    @Test
    public void getFirstLetterOfPassengersName() {

        //given
        Mockito.when(passenger.getName()).thenReturn("Brajan");
        //when
        char result = nameFirstLetter.getFirstletterOfPassengersName(passenger);
        //then
        assertEquals(firstLetter, result);
    }

    @Test
    public void getFirstLetterOfNullPassengersName() {

        //given
        Mockito.when(passenger.getName()).thenReturn(null);
        //when
        char result = nameFirstLetter.getFirstletterOfPassengersName(passenger);
        //then
        assertEquals(firstLetterNull, result);

    }

}