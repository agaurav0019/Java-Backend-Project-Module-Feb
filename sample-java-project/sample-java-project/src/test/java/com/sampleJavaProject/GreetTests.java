package com.sampleJavaProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class GreetTests {

    @Test
    void testFetchGreet() {
        Calendar cal_10_am = new Calendar.Builder().setTimeOfDay(10, 0, 0).build();
        Calendar cal_2_pm = new Calendar.Builder().setTimeOfDay(14, 0, 0).build();
        Calendar cal_8_pm = new Calendar.Builder().setTimeOfDay(19, 0, 0).build();

        Assertions.assertEquals(Greet.GREET_MORN, new Greet(cal_10_am).fetchGreeting());
        Assertions.assertEquals(Greet.GREET_AFT, new Greet(cal_2_pm).fetchGreeting());
        Assertions.assertEquals(Greet.GREET_EVEN, new Greet(cal_8_pm).fetchGreeting());
    }
}
