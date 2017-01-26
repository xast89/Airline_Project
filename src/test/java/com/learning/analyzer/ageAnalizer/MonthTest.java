package com.learning.analyzer.ageAnalizer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Cyprian on 2017-01-19.
 */
public class MonthTest {

    private Month monthAnalizer;

    @Before
    public void setUp() {
        monthAnalizer = new Month();
    }
    @Test
    public void checkCorrectPassengerMonthBirthday()  {

        //given

        //when
        int result = monthAnalizer.checkPassengerMonthBirthday("DEC");
        //then
        assertEquals(12, result);
    }

    @Test
    public void checkWrongPassangerMontBirthday(){


        //given

        //when
        int result = monthAnalizer.checkPassengerMonthBirthday("Cyc");
        //then
        assertEquals(0,result);
    }
}