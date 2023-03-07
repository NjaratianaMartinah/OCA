package edu.njara.oca.javaapi.date;

import java.lang.reflect.Method;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeApi {

    public static void main(String[] args){
//      Creating date, time and dateTime based by the current date, time  and datemtime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Static Method of(...) for creating LocalDateTime,Throw DateTimeException when wrong value
        LocalDateTime localDateTime1 = LocalDateTime.of(2021,Month.AUGUST,15,20,12);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,Month.AUGUST,15,20,12,40);
        LocalDateTime localDateTime3 = LocalDateTime.of(2021,Month.AUGUST,15,20,12,40,200);
        LocalDateTime localDateTime4 = LocalDateTime.of(2021,12,15,20,12);
        LocalDateTime localDateTime5 = LocalDateTime.of(2021,12,15,20,12,40);
        LocalDateTime localDateTime6 = LocalDateTime.of(2021,12,15,20,12,40,200);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime7 = LocalDateTime.of(localDate,localTime);

        System.out.println("1) " + localDateTime1);
        System.out.println("2) " + localDateTime2);
        System.out.println("3) " + localDateTime3);
        System.out.println("4) " + localDateTime4);
        System.out.println("5) " + localDateTime5);
        System.out.println("6) " + localDateTime6);
        System.out.println("7) " + localDateTime7);

        //Chain DateTime method
        LocalDateTime localDateTime8 = localDateTime7.minusDays(3).minusHours(5).minusSeconds(12);
        System.out.println("8) " + localDateTime8);

        //Period
        Period annually = Period.ofYears(1); //every one year
        Period everyTwoMonth  = Period.ofMonths(2); // every two months
        Period weekly = Period.ofWeeks(1); //every week
        Period everyThreeDay = Period.ofDays(3); // every 3 days
        Period everyYearAndWeek = Period.of(1,0,7);

        //Only the last method is used because the Period .ofXXX methods are static methods
        Period wrong = Period.ofYears(1).ofWeeks(1); // every week

        System.out.println("Plus annually: " + localDateTime8.plus(annually));
        System.out.println("Minus everyTwoMonth: " + localDateTime8.minus(everyTwoMonth));
        System.out.println("Plus weekly: " + localDateTime8.plus(weekly));
        System.out.println("Plus everyThreeDay: " + localDateTime8.plus(everyThreeDay));
        System.out.println("Plus everyYearAndWeek: " + localDateTime8.plus(everyYearAndWeek));

        // Formatting
        LocalDateTime localDateTime9 = LocalDateTime.of(2020,Month.DECEMBER,12,14,24,15,30);

        DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter dateTimeFormatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter dateTimeFormatterLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter dateTimeFormatterFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        System.out.println("SHORT: " + dateTimeFormatterShort.format(localDateTime9));
        System.out.println("MEDIUM: " + dateTimeFormatterMedium.format(localDateTime9));
        //System.out.println("LONG: " + dateTimeFormatterLong.format(localDateTime9)); // throw DateTimeException: Unable to extract ZoneId from temporal 2020-12-12T14:24:15.000000030
        //System.out.println("FULL: " + dateTimeFormatterFull.format(localDateTime9)); // throw DateTimeException: Unable to extract ZoneId from temporal 2020-12-12T14:24:15.000000030

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("DATE LONG: " + dateFormatter.format(localDateTime9));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("TIME SHORT: " + timeFormatter.format(localDateTime9));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println("Format using Pattern: " + localDateTime9.format(f));

    }
}