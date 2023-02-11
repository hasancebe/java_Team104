package day41_iterators;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterators {


    public static void main(String[] args) {

        // Some of classes which are in Collections, do not support index structure
        // in this kind of stuations, to reach all elements of a collection and to update them
        // we need to use something different than we have learned so far

        // normaly list supports index so we do not to use these methods
        // still lets try to reach and update values without using indexes


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        // print all elements without using indexes
        for (Integer each: list
             ) {
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println("-----------------------------");
        // Print increased values of the list by one without using index
        for (Integer each: list
             ) {
            System.out.print(each+1+" ");
        }
        System.out.println(list);

        System.out.println();
        System.out.println("-----------------------------");

        for (Integer each:list
             ) {
            each=each+1;
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println(list);

    }

}
