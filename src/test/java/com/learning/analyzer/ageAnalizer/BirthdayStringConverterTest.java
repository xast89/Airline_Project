package com.learning.analyzer.ageAnalizer;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Cyprian on 2017-01-19.
 */
public class BirthdayStringConverterTest {

    private BirthdayStringConverter birthdayStringConverter;

    @Before
    public void setUp() {
        birthdayStringConverter = new BirthdayStringConverter();
    }

    @Test
    public void convertPassengerBirthdayToIntTest() throws Exception {

        //given
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1990, 1, 1);
        //when
        Calendar result = birthdayStringConverter.convertPassengerBirthdayToInt("DOC/PAS/DE/123WXY/01JAN90/XPD/20JAN20");
        //then
        assertEquals(gregorianCalendar, result);
    }

    @Test
    public void checkIfPassengerInformationIsNull() {
        //given
        
        //when
        Calendar result = birthdayStringConverter.convertPassengerBirthdayToInt("dupa"); //incorrect String
        //then
        assertEquals(null,result);

    }

}



