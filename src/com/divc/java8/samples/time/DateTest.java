package com.divc.java8.samples.time;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // This code is deprecated since Java 9
        Date date = new Date();
        int day = date.getDay();
        System.out.println(day);
    }
}
