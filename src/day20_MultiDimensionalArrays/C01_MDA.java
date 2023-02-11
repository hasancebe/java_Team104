package day20_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {

    public static void main(String[] args) {

        int [][] arr = { {4,3,1,6,5,3,4,5,7,8,4,3,5},{7,4},{5,6,7},{}, {3,8,4,6}  };

        System.out.println(arr.length); //5
        System.out.println(arr[1].length);  // 2
        System.out.println(arr[1]);  // [I@19dfb72a // we can not print an array directly, we should ask for help from big brother Arrays.toString
        System.out.println(Arrays.toString(arr[1])); // [7, 4]

        System.out.println(Arrays.deepToString(arr)); //[[4, 3, 1], [7, 4], [5, 6, 7], [], [3, 8, 4, 6]]

        // I should use deepToStrign to print a multidimensional array
        System.out.println(Arrays.toString(arr)); // [[I@7e0ea639, [I@19dfb72a, [I@3d24753a, [I@59a6e353, [I@7a0ac6e3]

        System.out.println(arr[2][2]); // 7
        System.out.println(arr[2][1]); // 6
        System.out.println(arr[5][2]); // ArrayIndexOutOfBoundsException





    }



}
