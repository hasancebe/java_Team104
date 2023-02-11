package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_Questions {

    public static void main(String[] args) {

        // Question 5- Create a method that takes a positive integer from the user and
        // returns the smaller Fibonacci numbers to us as a list.
        // 0 1 1 2 3 5 8 13 21  34  55  89  144

        int userEntered = 9;

        System.out.println("calcFibNumbers(userEntered) = " + calcFibNumbers(userEntered)); // fibonacci list is returned and printed
    }

    public static List<Integer> calcFibNumbers(int userEntered){

        int fibonacciNumber1= 0;
        int fibonacciNumber2= 1;

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(fibonacciNumber1);
        fibonacciList.add(fibonacciNumber2);

        int nextFibonacciNumber =0;
        int index = 2;

        while(nextFibonacciNumber<=userEntered){

            nextFibonacciNumber = fibonacciList.get(index-2)+ fibonacciList.get(index-1);

            if(nextFibonacciNumber<=userEntered) {
                fibonacciList.add(nextFibonacciNumber);
            }
            index++;
        }
        return fibonacciList;
    }

}
