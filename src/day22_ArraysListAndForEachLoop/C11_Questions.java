package day22_ArraysListAndForEachLoop;

public class C11_Questions {

    public static void main(String[] args) {

        // Question 2- Create a method that calculates the squares of each element in
        // the given int array and prints the sum of its squares.

        Integer [] arr = {1,2,3};
        sumOfSquares(arr);
    }

    public static void sumOfSquares (Integer [] arr){

        int square =0;
        int total = 0;

        for (Integer each: arr
             ) {

            square = each* each;
            total += square;    // total = total + square

        }

        System.out.println(total);

    }
}
