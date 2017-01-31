package com.learning.analyzer.ScheduleChangeAnalizer.Mail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cyprian on 2017-01-31.
 */
public class MailSpliterTest {

    private MailSpliter mailSpliter;

    @Before
    public  void  setUp(){
        mailSpliter = new MailSpliter();
    }

    @Test
    public void tryGetEmailAdressFromCorrectPassengerInformation() throws Exception {

        //given

        //when
        String result = mailSpliter.findMailInformatiom("mail/cforemny@gmail.com");
        //then
        assertEquals("cforemny@gmail.com",result);

    }

    @Test
    public void checkIfPassengerInformationMailIsNotCorrect(){

        // given

        //when
        String result = mailSpliter.findMailInformatiom("mail/incorrectMail");
        //then
        assertEquals(null,result);
    }
    @Test
    public void checkIfPassengerInnformationMAilIsNull(){

        //given

        //when
        String result = mailSpliter.findMailInformatiom(null);
        //then
        assertEquals(null,result);
    }

}