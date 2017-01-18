package com.learning.analyzer.ageAnalizer;

import com.learning.structure.booking.Passenger;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


/**
 * Created by Cyprian on 2017-01-17.
 */
@RunWith(MockitoJUnitRunner.class)
public class PassportAnalizerTest extends TestCase {

    @InjectMocks
    private PassportAnalizer passportAnalizer;

    @Mock
    private BirthdayStringConverter birthdayStringConverter;
    private Passenger passenger;

    @Test
    public void testGetBirthDayFromPassport() {


    }
}