package day19_Arrays;

import java.util.Arrays;

public class C08_AddingNewValue {

    public static void main(String[] args) {

        // how to add another element to array


        int [] abc = { 3,5,3,6,8,5,3,6}; // length is 8

        int numberToAdd =10;

        addNewValueToArray(abc,numberToAdd);

    }

    public static void addNewValueToArray(int [] arr,int numberToAdd){

        int[] longerArr = new int[arr.length+1];  // created an  array with (8+1) length

        for (int i = 0; i <arr.length ; i++) {
            longerArr[i]=arr[i];

        }
        longerArr[longerArr.length-1]=numberToAdd;
        System.out.println(Arrays.toString(longerArr));  // [3, 5, 3, 6, 8, 5, 3, 6, 10]
    }

}
