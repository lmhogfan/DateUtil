package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilTest
{
    private static LocalDateTime now= LocalDateTime.now();
    private static LocalDateTime satYes=LocalDateTime.of(2018,5,5,17,0);
    private static LocalDateTime thursNo=LocalDateTime.of(2018,5,3,20,0);
    private static LocalDateTime thursYes=LocalDateTime.of(2018,5,3,17,0);

    @Test
    void isHappyHour()
    {
        assertTrue(DateTimeUtil.isHappyHour(now));
        assertFalse(DateTimeUtil.isHappyHour(satYes));
        assertFalse(DateTimeUtil.isHappyHour(thursNo));
        assertTrue(DateTimeUtil.isHappyHour(thursYes));

    }
}