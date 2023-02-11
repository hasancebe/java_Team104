package day27_ImmutableAndDateTime;

import java.time.LocalTime;

public class C08_Questions {

    public static void main(String[] args) {

        // please calculate the time of the process
        // how many nanoseconds will it take for this loop?
        // for loop from 1 to 100 000, find the total value


        LocalTime loopStars = LocalTime.now();

        int total=0;

        for (int i = 1; i <100000 ; i++) {

            total+=i;

        }
        LocalTime loopEnds = LocalTime.now();

        int totalSec = loopEnds.getSecond()-loopStars.getSecond();
        System.out.println("totalSec = " + totalSec);
        int totalNanoSec = loopEnds.getNano()-loopStars.getNano();
        System.out.println(totalNanoSec);

    }
}
