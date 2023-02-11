package day43_collectionsDeque;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_SetCollections {

    public static void main(String[] args) {

        Set<Integer> setHash = new HashSet<>();

        /*
        Detele all duplacations from a given array.
         */


        int [] arr= { 1,2,3,4,5,3,2,1,5,4,2,3,2,3,4,2,1,4,3,2,1,5,5,3,2,1};

        Set<Integer> tempNumbersSet = new HashSet<>();

        for (Integer each: arr
             ) {
            tempNumbersSet.add(each);
        }

        System.out.println("this is the temp set : "+tempNumbersSet);


        arr = new int[tempNumbersSet.size()];

        int index =0;
        for (Integer each: tempNumbersSet
             ) {

            arr[index]=each;
            index++;
        }
        System.out.println("this is the arr : "+Arrays.toString(arr));

    }



}
