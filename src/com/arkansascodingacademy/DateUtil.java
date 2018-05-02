package com.arkansascodingacademy;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
public class DateUtil
{
    //Return a LocalDate object for New Years of the given year
    public static LocalDate getNewYears(int year)
    {
        LocalDate answer=LocalDate.of(year, Month.JANUARY, 1);
        return answer;
    }

    //Return a LocalDate object for Christmas of the given year
    public static LocalDate getChristmas(int year)
    {
        LocalDate answer=LocalDate.of(year, Month.DECEMBER,25);
        return answer;
    }

    //In 1999 it is time to party
    //If the given year is 1999 return true
    public static boolean isPartyTime(LocalDate date)
    {
        if (date.getYear() == 1999)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //After 1999 you are out of time
    //If the given year is after 1999 return true
    public static boolean isOutOfTime(LocalDate date)
    {
        if (date.getYear() > 1999)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //You took too long to order your soup
    //You cannot try again for one year
    //Return the given date one year from now
    public static LocalDate getSoupDay(LocalDate date)
    {
        return date.plus(1, ChronoUnit.YEARS);
    }

    //Return a LocalDate object for the next Christmas after the given date
    public static LocalDate getNextChristmas(LocalDate date)
    {

        LocalDate nextChristmas=LocalDate.of(date.getYear()+1, Month.DECEMBER,25);
        LocalDate thisChristmas=LocalDate.of(date.getYear(), Month.DECEMBER, 25);

        if (date.isBefore(thisChristmas))
        {
            return thisChristmas;
        }
        else
        {
            return nextChristmas;
        }
    }

    //Return the number of days until Christmas
    //If it is Christmas return the number of days until the next Christmas
    public static long getDaysUntilChristmas(LocalDate date)
    {
        LocalDate christmas=LocalDate.of(date.getYear(), Month.DECEMBER, 25);
     if (date.isEqual(christmas))
     {
         LocalDate nextChristmas= LocalDate.of(date.getYear()+1, Month.DECEMBER,25);
         return date.until(nextChristmas, ChronoUnit.DAYS);
     }
     else
     {
         return date.until(christmas, ChronoUnit.DAYS);
     }
    }

    //Return a array of twelve ints holding the number of days in each month
    public static int[] daysInMonth(int year)
    {
        int[] days= new int[12];
        LocalDate answer= LocalDate.of(year,Month.JANUARY,1);
        for(int x=0; x<12; x++)
        {
            if (x==0||x==2||x==4||x==6||x==7||x==9||x==11)
            {
                days[x]=31;
            }
            else if (answer.isLeapYear()&&x==1)
            {
                days[x]=29;
            }
            else if (x==1)
            {
                days[x]=28;
            }
            else
            {
                days[x]=30;
            }
        }
        return days;
    }
}
