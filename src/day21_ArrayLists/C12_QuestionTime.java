package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C12_QuestionTime {


    public static void main(String[] args) {

        //Question 3- Create a method that deletes the elements containing unwanted letters
        // in a given String list and returns the remaining part to us as a list.


        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Hasan");
        names.add("Huseyin");

        System.out.println(names); //[Ali, Veli, Hasan, Huseyin]

        System.out.println("iDontWantToSeeThisLetter(names) = " + iDontWantToSeeThisLetter(names, "e"));
    }

    public static List<String> iDontWantToSeeThisLetter(List<String> names, String unwantedLetter) {

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {

            if (!names.get(i).contains(unwantedLetter)) {

                newList.add(names.get(i));
            }
        }
        return newList;

       // tomorrow java lesson will start at 17:00 o'clock
       // tomorrow SDLC lesson will start at 20:30 o'clock


    }
}
