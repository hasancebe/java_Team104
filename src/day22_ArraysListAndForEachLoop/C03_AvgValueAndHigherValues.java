package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_AvgValueAndHigherValues {

    public static void main(String[] args) {

        // Create a method that calculates the avarage value of given values of a list,
        // than prints all volues which are over avg value

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbersHigherThanAvg(numbers);
    }

    public static void numbersHigherThanAvg(List<Integer> numbers) {

        int avgNumber = 0;
        int total = 0;

        for (int i = 0; i < numbers.size(); i++) {
            total = total + numbers.get(i);
        }

        avgNumber = total / numbers.size();
        System.out.println("avgNumber is = " + avgNumber);

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > avgNumber) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
