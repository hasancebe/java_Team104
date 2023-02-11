package day18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_CreatingArray {

    public static void main(String[] args) {

        //Question 5- Create a method that takes the length and elements of the array from the user
        // and creates the array and returns it to us.
        System.out.println(Arrays.toString(createingMethod()));
    }

    public static int[] createingMethod(){

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the length of the array");
        int length = scan.nextInt();
        int [] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("please enter values to add the array");
            arr[i]= scan.nextInt();

        }
        return arr;

    }

}
