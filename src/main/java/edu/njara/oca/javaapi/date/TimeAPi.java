package edu.njara.oca.javaapi.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

        LocalTime localTime8 = LocalTime.of(20,56,32).minusHours(28).minusMinutes(5).minusSeconds(2).minusNanos(45);;
        System.out.println(localTime8);

        //Period
        Period period = Period.ofWeeks(1);
       // localTime8.plus(period);    // throw UnsupportedTemporalTypeException : Unsupported unit: Days

        //Formatting
        LocalTime localTime9 = LocalTime.of(15,2,14);
        System.out.println("ISO_LOCAL_TIME: " + localTime9.format(DateTimeFormatter.ISO_LOCAL_TIME));
        //System.out.println("ISO_DATE_TIME" + localTime9.format(DateTimeFormatter.ISO_DATE_TIME)); // throw UnsupportedTemporalTypeException: Unsupported field: Year

        //Formatting
        DateTimeFormatter timeFormatterShort = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter timeFormatterFull = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter timeFormatterMedium = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println("SHORT: " + timeFormatterShort.format(localTime9));
        System.out.println("MEDIUM: " + timeFormatterMedium.format(localTime9));
        //timeFormatterFull.format(localTime9); //throw DateTimeException: Unable to extract ZoneId from temporal 15:02:14 with chronology ISO

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //dateTimeFormatter.format(localTime9); // throws UnsupportedTemporalTypeException: Unsupported field: MonthOfYear
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        //dateFormatter.format(localTime9); // throws UnsupportedTemporalTypeException: Unsupported field: MonthOfYear


    }
}
