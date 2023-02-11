package day20_MultiDimensionalArrays;

public class C06_Questions {


    //Question 5- Create a method that prints the sum of the last elements of each inner array in a given 2 dimensional array.

    public static void main(String[] args) {

        int[][] numbers = {{2, 5, 3, 5}, {3, 6, 8, 3}};
        //numbers[i][numbers[i].length-1]

        sumOfLastValues(numbers);
    }
    public static void sumOfLastValues(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i][numbers[i].length - 1];
        }
        System.out.println(sum);
    }
}
