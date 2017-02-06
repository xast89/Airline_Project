package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cyprian on 2017-02-06.
 */
public class EmailListAsStringTest {

    private  EmailListAsString emailListAsString;

    @Before
    public void setUp(){
        emailListAsString = new EmailListAsString();
    }

    @Test
    public void createAdresses() {

        //given

        //when
        String result = emailListAsString.createAdresses();
        //then
    }

}