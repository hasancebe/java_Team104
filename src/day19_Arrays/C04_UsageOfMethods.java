package day19_Arrays;

import day18_arrays.*;

import java.util.Arrays;

public class C04_UsageOfMethods {

    public static void main(String[] args) {

        int [] arr={4,7,6,9,-4,-6};

        arr=C03_AddTwoToAllVariables.increaseValueBy2(arr);
        System.out.println(Arrays.toString(arr)); // [6, 9, 8, 11, -2, -4]

        int totalValue=C04_AddsAllPositiveValues.positiveNumbersAdd(arr);
        System.out.println(totalValue); // 34

        System.out.println("---------------------");
        C05_FindDesiredNumberInArray.isThereDesiredNumber(arr,8);

//        arr=C06_CreatingArray.createingMethod();
//        System.out.println(Arrays.toString(arr));

        String [] arrStrint = {"ali","atmaca","fish"};

        C07_PrintLongestShortestWord.shortestLongestWord(arrStrint);

    }
}
