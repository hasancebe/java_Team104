package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_remove {


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int[] arr = {3, 4, 6, 3, 5, 3, 5, 7, 8, 4, 3, 5, 7, 3, 6};

        for (int i = 0; i < arr.length; i++) {

            numbers.add(arr[i]);
        }

        System.out.println(numbers); // [3, 4, 6, 3, 5, 3, 5, 7, 8, 4, 3, 5, 7, 3, 6]

        numbers.remove(6);

        System.out.println(numbers); // [3, 4, 6, 3, 5, 3, 7, 8, 4, 3, 5, 7, 3, 6]

        Integer toDelete = 6;
        numbers.remove(toDelete);

        System.out.println(numbers); // [3, 4, 3, 5, 3, 7, 8, 4, 3, 5, 7, 3, 6]

        numbers.remove(toDelete);
        System.out.println(numbers); // [3, 4, 3, 5, 3, 7, 8, 4, 3, 5, 7, 3]

        System.out.println(numbers.remove(5)); // returns deleted value ıf it could delete it // 3
        // numbers.remove(100); // IndexOutOfBoundsException: // gives error




    }
}
