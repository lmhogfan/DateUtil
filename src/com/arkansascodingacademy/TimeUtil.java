package com.arkansascodingacademy;

import java.time.LocalTime;

@SuppressWarnings("WeakerAccess")
public class TimeUtil
{
    //Return true if it is after 12PM and before 4PM
    public static boolean isAfternoon(LocalTime time)
    {
        boolean afternoon;
        LocalTime noon= LocalTime.of(12,0);
        LocalTime sixteen= LocalTime.of(16,0);
        if (time.isAfter(noon)&&time.isBefore(sixteen))
        {
            afternoon=true;
        }
        else
        {
            afternoon=false;
        }
        return afternoon;
    }

    //Return true if it is after midnight and before 4AM
    public static boolean isAfterMidnight(LocalTime time)
    {
        boolean afterMidnight = false;
        LocalTime midnight= LocalTime.MIDNIGHT;
        LocalTime four= LocalTime.of(4, 0);

        if(time.isAfter(midnight)&&time.isBefore(four))
        {
            afterMidnight=true;
        }

        return afterMidnight;
    }
}
