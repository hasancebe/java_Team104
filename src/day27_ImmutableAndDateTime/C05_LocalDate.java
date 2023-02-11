package day27_ImmutableAndDateTime;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class C05_LocalDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println(date); // 2022-11-05

        System.out.println("date.minusDays(65) = " + date.minusDays(65));

        System.out.println("date.minusWeeks(45) = " + date.minusWeeks(45));

        System.out.println("date.minusDays(556).minusWeeks(222).minusMonths(12).minusYears(2) = " + date.minusDays(556).minusWeeks(222).minusMonths(12).minusYears(2));

        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());

        System.out.println(date.isLeapYear());
        System.out.println("date.withYear(2000).isLeapYear() = " + date.withYear(2000).isLeapYear());
        System.out.println("date.withYear(2000) = " + date.withYear(2000));
        System.out.println("date.withMonth(5) = " + date.withMonth(5));
        System.out.println("date.withYear(1453).withMonth(8).withDayOfMonth(25) = " + date.withYear(1453).withMonth(8).withDayOfMonth(25));

        LocalDate date2 = date.withYear(2000).withMonth(6).withDayOfMonth(12);
        LocalDate date3 = LocalDate.of(2000,9,13);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println("date.isAfter(date2) = " + date.isAfter(date2));
        System.out.println("date.isBefore(date2) = " + date.isBefore(date2));
        System.out.println("date.equals(date2) = " + date.equals(date2));

        System.out.println("date.lengthOfYear() = " + date.lengthOfYear());
        System.out.println("date3.lengthOfYear() = " + date3.lengthOfYear());

        LocalDate birthDay = LocalDate.of(1984,01,31);
        System.out.println("birthDay.getDayOfWeek() = " + birthDay.getDayOfWeek());


    }


}
