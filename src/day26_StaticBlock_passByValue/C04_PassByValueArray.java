package day26_StaticBlock_passByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

    public static void main(String[] args) {
        // create a method that takes an array and increases its values by 5 then returns that array

        int [] arr = {3,4,5};

        System.out.println("orginal array: "+Arrays.toString(arr));

        incValuesOfArray(arr);
        incValuesOfArray(arr);
        incValuesOfArray(arr);

        System.out.println("orjinal array from main method : "+Arrays.toString(arr));


    }


    public static int[] incValuesOfArray (int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i]+5;

        }

        return arr;
    }



}
