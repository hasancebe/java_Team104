package day20_MultiDimensionalArrays;

public class C04_Questions {

    //Question 1- Create a method that calculates total value of the even numbers in a given 2 dimensional array and prints the result.

    public static void main(String[] args) {


        int[][] numbers = {{2, 5, 3, 5}, {3, 6, 8, 3}};

        calculationOfEvenNumbers(numbers);
    }


    public static void calculationOfEvenNumbers(int[][] numbers) {

        int totalValue = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    totalValue = totalValue + numbers[i][j];

                }
            }
        }
        System.out.println("method worked and total value is =" + totalValue); // 16
    }


}
