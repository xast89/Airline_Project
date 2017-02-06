package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Cyprian on 2017-02-06.
 */
public class EmailListAsStringTest {


    private EmailListAsString emailListAsString;


    @Before
    public void setUp() {
        emailListAsString = new EmailListAsString();
    }

    @Test
    public void createAdressesAsOneString() {

        //given

        //when
        String result = emailListAsString.createAdresses();
        //then
        Assert.assertEquals("cforemny@gmail.com, pawel.gondek@gmail.com , cforemny@gmail.com, ", result);
    }

}