package day27_ImmutableAndDateTime;

import java.time.LocalDateTime;

public class C07_LocalDateTime {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("dateTime.minusSeconds(242342342) = " + dateTime.minusSeconds(242342342));

        System.out.println("dateTime.plusSeconds(234234535) = " + dateTime.plusSeconds(934234535));






    }

}
