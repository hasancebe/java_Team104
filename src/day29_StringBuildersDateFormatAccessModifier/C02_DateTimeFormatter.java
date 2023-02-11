package day29_StringBuildersDateFormatAccessModifier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_DateTimeFormatter {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(time.format(dtf1)); // 11/11/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/YY");
        System.out.println(time.format(dtf2));  // 11/11/22

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd:MMM:YYYY");
        System.out.println(time.format(dtf3)); // 11:Kas:2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd.MMMM.YY");
        System.out.println(time.format(dtf4)); // 11.Kasım.22

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(time.format(dtf5)); // 10:52 ÖS

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm a EEEE ");
        System.out.println(time.format(dtf6)); // 10:55 ÖS Cuma





    }
}
