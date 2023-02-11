package day20_MultiDimensionalArrays;

public class C03_FindingLongestWord {


    public static void main(String[] args) {

        String[][] arr = {{"Nesrin", "Ali", "Veli"}, {"Mahmut", "John", "Michael"}, {"Muhammed Ali", "Dark"}};


        String longestWord = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                //arr[i][j]

                if (longestWord.length() < arr[i][j].length()) {

                    longestWord = arr[i][j];
                }
            }
        }
        System.out.println(longestWord);
    }
}
