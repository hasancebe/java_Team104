package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_Questions {

    public static void main(String[] args) {

        //Question 1- For the repeating elements in a given array,
        // create a method that will delete the duplicates and make only 1 of all elements and return them to us.


        List<Integer> numbers = new ArrayList<>();

        int[] arr = {3, 4, 6, 3, 5, 3, 5, 7, 8, 4, 3, 5, 7, 3, 6};

        for (int i = 0; i < arr.length; i++) {

            numbers.add(arr[i]);
        }
        System.out.println(numbers);
        System.out.println("uniqueList(numbers) = " + uniqueList(numbers));
    }

    public static List<Integer> uniqueList(List<Integer> numbers) {

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (!uniqueList.contains(numbers.get(i))) {
                uniqueList.add(numbers.get(i));
            }
        }

        return uniqueList;

    }
}
