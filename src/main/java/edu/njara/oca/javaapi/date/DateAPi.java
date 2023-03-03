package edu.njara.oca.javaapi.date;
import  java.time.*;
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
        //LocalDate localDate2 = LocalDate.of(2025,2,30); //Invalid date 'FEBRUARY 30'

        System.out.println(localDate1);
        System.out.println(localDate2);

        //Manipulating Date


    }
}
