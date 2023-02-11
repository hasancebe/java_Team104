package day19_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {


        int [] arr = {3,7,2,8,4,8,4,2,7,4,6,8,4,6,8,4,8};

        System.out.println(Arrays.binarySearch(arr, 2)); //8
        System.out.println(Arrays.binarySearch(arr, 7)); //-16
        System.out.println(Arrays.binarySearch(arr, 4)); //13

        Arrays.sort(arr);
        System.out.println("--------------");
        System.out.println(Arrays.binarySearch(arr, 2)); //1
        System.out.println(Arrays.binarySearch(arr, 7)); //11
        System.out.println(Arrays.binarySearch(arr, 4)); //3
        System.out.println(Arrays.binarySearch(arr,10)); // -19
        System.out.println(Arrays.binarySearch(arr,100)); // -19
        System.out.println(Arrays.binarySearch(arr,5)); // -19

        // binary search may give us wrong answers if we do not use sort method from Arrays Class
        // If we search for a element which is not in the array, binary search will return
        // a "-" number. and this "-" number will give us the place as if it was in the array


        System.out.println(Arrays.toString(arr));


    }



}
