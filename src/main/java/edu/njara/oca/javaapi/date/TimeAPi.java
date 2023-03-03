package edu.njara.oca.javaapi.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeAPi {

    public static void main(String[] args){
        //Creating date, time and dateTime based by the current date, time  and datemtime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //Static Method of(...) for creating LocalTime,Throw DateTimeException when wrong value
        LocalTime localTime1 = LocalTime.of(12,24);
        LocalTime localTime2 = LocalTime.of(22,59,2);
        LocalTime localTime3 = LocalTime.of(15,56,50,200);

//      LocalTime localTime4 = LocalTime.of(24,26);  //Invalid value for HourOfDay (valid values 0 - 23): 24
//      LocalTime localTime5 = LocalTime.of(22,89,2); //Invalid value for MinuteOfHour (valid values 0 - 59): 89
//      LocalTime localTime6 = LocalTime.of(15,56,89,500); //Invalid value for SecondOfMinute (valid values 0 - 59): 89
//      LocalTime localTime7 = LocalTime.of(15,56,50,1000000000); //Invalid value for NanoOfSecond (valid values 0 - 999999999): 1000000000

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }
}
