package com.sampleJavaProject;

import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet(Calendar.getInstance(Locale.getDefault()));
        System.out.println(greet.fetchGreeting() + " world!");
    }
}