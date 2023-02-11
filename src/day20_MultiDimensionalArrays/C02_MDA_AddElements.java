package day20_MultiDimensionalArrays;

public class C02_MDA_AddElements {


    public static void main(String[] args) {

        // find the total value of elements
        int[] arr = {1, 5, 6};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            total = total + arr[i];

        }
        System.out.println(total);  // 12

        int totalValueOfMulty = 0;

        int[][] arrMulty = {{2, 3, 4}, {2, 3}, {3, 8}};

        for (int i = 0; i < arrMulty.length; i++) {

            for (int j = 0; j < arrMulty[i].length; j++) {
                System.out.print(arrMulty[i][j] + " ");
                totalValueOfMulty = totalValueOfMulty + arrMulty[i][j];
            }
        }
        System.out.println();
        System.out.println(totalValueOfMulty);
    }


}
