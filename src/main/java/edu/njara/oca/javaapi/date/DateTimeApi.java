package edu.njara.oca.javaapi.date;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

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

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
        System.out.println(localDateTime5);
        System.out.println(localDateTime6);
        System.out.println(localDateTime7);
    }
}
