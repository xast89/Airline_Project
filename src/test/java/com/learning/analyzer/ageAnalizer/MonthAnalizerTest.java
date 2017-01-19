package com.learning.analyzer.ageAnalizer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Cyprian on 2017-01-19.
 */
public class MonthAnalizerTest {

    private MonthAnalizer monthAnalizer;

    @Before
    public void setUp() {
        monthAnalizer = new MonthAnalizer();
    }
    @Test
    public void checkpassengerMonthBirthday() throws Exception {

        //given

        //when
        int result = monthAnalizer.checkpassengerMonthBirthday("JUN");
        //then
        assertEquals(7, result);
    }
}