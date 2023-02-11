package day18_arrays;

public class C04_AddsAllPositiveValues {


    public static void main(String[] args) {
       //Question 2- Write a method that adds the positive integers in a given array and
        // returns the result to us.

        int [] arr = {2,-3,4,-6,2,6,-9,1,2,3,4};

        System.out.println(positiveNumbersAdd(arr));

    }
    public static int positiveNumbersAdd(int[] arr){

        int total =0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>0){
                total=total+arr[i];
            }
        }
        return total;

    }

}
