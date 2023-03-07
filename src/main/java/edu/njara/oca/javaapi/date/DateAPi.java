package edu.njara.oca.javaapi.date;
import  java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAPi {
    public static void main(String[] args){
        //Creating date based by the current date
        LocalDate localDate = LocalDate.now();

        //LocalDate localDate5 = new LocalDate() // DOESN'T COMPILE

        System.out.println(localDate);

        //LocalDate static method of(...) to create Date, Throw DateTimeException when wrong value
        LocalDate localDate1 = LocalDate.of(2023,Month.APRIL,12);
        LocalDate localDate2 = LocalDate.of(2025,2,15);

        //LocalDate localDate3 = LocalDate.of(2023,Month.APRIL,45);
        //LocalDate localDate4 = LocalDate.of(2023,Month.APRIL,57);
        //LocalDate localDate5 = LocalDate.of(2025,2,30); //Invalid date 'FEBRUARY 30'

        System.out.println(localDate1);
        System.out.println(localDate2);

        //Manipulating Date
        LocalDate localDate6 = LocalDate.of(2023,Month.NOVEMBER,12);
        System.out.println("The date: " + localDate6);
        localDate6 = localDate6.plusDays(2);
        System.out.println("The date plusDays: " + localDate6);
        localDate6 = localDate6.plusMonths(1);
        System.out.println("The date plusMonths: " + localDate6);
        localDate6 = localDate6.plusWeeks(5);
        System.out.println("The date plusWeeks: " + localDate6);
        localDate6 = localDate6.plusYears(2);
        System.out.println("The date plusYears: " + localDate6);

        //Period
        Period period = Period.ofMonths(2);
        Period period1 = Period.ofDays(5);
        System.out.println("Plus period: " + localDate6.plus(period));
        System.out.println("Minus period: " + localDate6.minus(period1));

        // Formatting
        LocalDate localDate7 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println("ISO_LOCAL_DATE: " + localDate7.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("BASIC_ISO_DATE: " + localDate7.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("ISO_WEEK_DATE: " + localDate7.format(DateTimeFormatter.ISO_WEEK_DATE));
        //....
       // System.out.println("ISO_OFFSET_DATE: " + localDate7.format(DateTimeFormatter.ISO_OFFSET_DATE)); // throw UnsupportedTemporalTypeException: Unsupported field: OffsetSeconds
       // System.out.println("ISO_DATE_TIME: " + localDate7.format(DateTimeFormatter.ISO_DATE_TIME)); //throw UnsupportedTemporalTypeException : Unsupported field: HourOfDay

        DateTimeFormatter dateFormatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter dateFormatterFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter dateFormatterMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter dateFormatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        System.out.println("SHORT: " + dateFormatterShort.format(localDate7));
        System.out.println("FULL: " + dateFormatterFull.format(localDate7));
        System.out.println("MEDIUM: " + dateFormatterMedium.format(localDate7));
        System.out.println("LONG: " + dateFormatterMedium.format(localDate7));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //dateTimeFormatter.format(localDate7); // throws UnsupportedTemporalTypeException: Unsupported field: ClockHourOfAmPm
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        //timeFormatter.format(localDate7); // throws UnsupportedTemporalTypeException: Unsupported field: ClockHourOfAmPm
    }
}
