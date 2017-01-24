package com.learning.analyzer.ageAnalizer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Cyprian on 2017-01-19.
 */
public class MonthAnalizerTest {

    private Month monthAnalizer;

    @Before
    public void setUp() {
        monthAnalizer = new Month();
    }
    @Test
    public void checkpassengerMonthBirthday()  {

        //given

        //when
        int result = monthAnalizer.checkPassengerMonthBirthday("JUN");
        //then
        assertEquals(7, result);
    }
}