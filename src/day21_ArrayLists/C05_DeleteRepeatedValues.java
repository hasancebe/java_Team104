package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_DeleteRepeatedValues {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int[] arr = {3, 4, 6, 3, 5, 3, 5, 7, 8, 4, 3, 5, 7, 3, 6};

        for (int i = 0; i < arr.length; i++) {

            numbers.add(arr[i]);
        }

        List<Integer> uniqueElements = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (!uniqueElements.contains(numbers.get(i))) {

                uniqueElements.add(numbers.get(i));
            }
        }
        System.out.println(uniqueElements);


    }
}
