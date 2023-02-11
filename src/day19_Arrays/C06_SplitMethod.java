package day19_Arrays;

import java.util.Arrays;

public class C06_SplitMethod {

    public static void main(String[] args) {


        String str = "Java is very very very beautiful";

        // let's find how many "e" it has

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        int counter =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals("e")){
                counter++;
            }

        }
        if (counter==0){
            System.out.println(" no e in the array");
        } else if (counter>0) {
            System.out.println("array has e "+counter+" times");

        }

        System.out.println("--------------------------------");

        //"Java is very very very beautiful"
        arr = str.split("e");
        System.out.println(Arrays.toString(arr));
        System.out.println("there are "+(arr.length-1) + " e in the array");



    }

}
