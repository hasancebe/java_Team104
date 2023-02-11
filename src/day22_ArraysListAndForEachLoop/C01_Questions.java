package day22_ArraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_Questions {

    /*
    Fibonacci Numbers

    0 1 1 2 3 5 8 13 21  34  55  89  144

     */


    //Question 4- Take a given positive integer n, create a method that returns us the first n Fibonacci numbers as a list.


    public static void main(String[] args) {
        int n = 5;

        System.out.println("calculateFibonacciNumbers(n) = " + calculateFibonacciNumbers(n));


    }

    public static List<Integer> calculateFibonacciNumbers(int n) {

        int fibonacciNumber1= 0;
        int fibonacciNumber2= 1;

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(fibonacciNumber1);
        fibonacciList.add(fibonacciNumber2);

        int nextFibonacciNumber =0;

        for (int i = 2; i < n ; i++) {

            nextFibonacciNumber = fibonacciList.get(i-2) + fibonacciList.get(i-1);

            fibonacciList.add(nextFibonacciNumber);

        }


        return fibonacciList;


    }


}
