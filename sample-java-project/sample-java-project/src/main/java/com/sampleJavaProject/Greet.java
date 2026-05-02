package com.sampleJavaProject;

import java.util.Calendar;
import java.util.Date;

public class Greet {
    public static final String GREET_MORN = "Good Morning";
    public static final String GREET_AFT = "Good Afternoon";
    public static final String GREET_EVEN = "Good Evening";

    public static String fetchGreeting() {
        int hotd = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hotd < 12) {
            return GREET_MORN;
        }
        else if (hotd < 18) {
            return GREET_AFT;
        } else {
            return GREET_EVEN;
        }
    }
}
