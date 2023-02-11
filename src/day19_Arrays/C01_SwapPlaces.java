package day19_Arrays;

import java.util.Arrays;

public class C01_SwapPlaces {

    public static void main(String[] args) {


        //Question 3- (Interview) Create a method that will shift all the elements in a
        // given array to the right and move the last element to the beginning, save the array as new.

        //Orn : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]

        int [] input = {4,5,6,7};

        System.out.println(Arrays.toString(swapElements(input)));
    }

    public static int[] swapElements(int[] arr){

        int lastChar = arr[arr.length-1]; //empty bucket

        for (int i = arr.length-2 ; i >=0 ; i--) {

            arr[i+1]=arr[i];
        }
        arr[0]=lastChar;

        return arr;

    }
}
