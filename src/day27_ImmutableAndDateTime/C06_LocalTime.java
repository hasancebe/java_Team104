package day27_ImmutableAndDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C06_LocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);  // 19:04:32.366605600

        LocalTime time2 = LocalTime.of(15,9,56,234234);
        System.out.println("time2 = " + time2);

        System.out.println("time.compareTo(time2) = " + time.compareTo(time2)); // time.compareTo(time2) = 1
        System.out.println("time2.compareTo(time) = " + time2.compareTo(time)); // time2.compareTo(time) = -1

        System.out.println(time.getNano());

        System.out.println("time.minusSeconds(345345) = " + time.minusSeconds(345));
        System.out.println("time.minusMinutes(400) = " + time.minusMinutes(400));
    }
}
