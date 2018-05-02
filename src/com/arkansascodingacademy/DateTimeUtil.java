package com.arkansascodingacademy;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@SuppressWarnings("WeakerAccess")
public class DateTimeUtil
{
    //Return true is it is happy hour
    //Happy hour is 4 to 7 Mon-Thur and 4 to 6 on Friday
    public static boolean isHappyHour(LocalDateTime dateTime)
    {
        LocalDateTime sixteen= LocalDateTime.of(dateTime.getYear(),dateTime.getMonth(),dateTime.getDayOfMonth(), 16,0);
        LocalDateTime eighteen= LocalDateTime.of(dateTime.getYear(),dateTime.getMonth(),dateTime.getDayOfMonth(), 18,0);
        LocalDateTime nineteen= LocalDateTime.of(dateTime.getYear(),dateTime.getMonth(),dateTime.getDayOfMonth(), 19,0);

        boolean isHappyHour = false;

        if ((dateTime.getDayOfWeek()==DayOfWeek.MONDAY||dateTime.getDayOfWeek()==DayOfWeek.TUESDAY||
                dateTime.getDayOfWeek()==DayOfWeek.WEDNESDAY||dateTime.getDayOfWeek()==DayOfWeek.THURSDAY)&&
                dateTime.isAfter(sixteen)&&dateTime.isBefore(nineteen))
        {
            isHappyHour=true;
        }
        else if (dateTime.getDayOfWeek()==DayOfWeek.FRIDAY&&dateTime.isAfter(sixteen)&&dateTime.isBefore(eighteen))
        {
            isHappyHour=true;
        }

        return isHappyHour;
    }
}
