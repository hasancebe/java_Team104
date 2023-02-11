package day18_arrays;

import java.util.Arrays;

public class C03_AddTwoToAllVariables {

    public static void main(String[] args) {
        //Question 1- Create a method that adds 2 to all variables of an array , returns the array

        int [] arr = {2,4,6,8,10};

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i]+2;
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(increaseValueBy2(arr)));

        arr=increaseValueBy2(arr);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] increaseValueBy2 (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+2;
        }
        return arr;

    }


}
