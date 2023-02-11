package day27_ImmutableAndDateTime;

import java.time.LocalDate;
import java.time.Period;

public class C09_Periods {

    public static void main(String[] args) {

        // let's create a program to calculate the age.

        LocalDate toDay = LocalDate.now();
        LocalDate birthDay = LocalDate.of(1984,01,31);

        Period passedTime = Period.between(birthDay,toDay);
        System.out.println("passedTime = " + passedTime);
        System.out.println("passedTime.getYears() = " + passedTime.getYears());




    }
}
