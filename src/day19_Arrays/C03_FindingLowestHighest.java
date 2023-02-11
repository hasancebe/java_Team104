package day19_Arrays;

import java.util.Arrays;

public class C03_FindingLowestHighest {

    public static void main(String[] args) {

        //Find the lowest and highest value
        int [] arr = {2,3,5,1,6,8,3,2,6,8,4,6};

        int lowest =arr[0];
        int highest =arr[0];

        for (int i = 1; i <arr.length ; i++) {
            // for the lowestone
            if(lowest>arr[i]){
                lowest=arr[i];
            }
            //for the highest
            if(highest<arr[i]){
                highest=arr[i];
            }
        }
        System.out.println("lowest "+lowest);
        System.out.println("highest "+highest);


        //{2,3,5,1,6,8,3,2,6,8,4,6};
        System.out.println("---------------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("lowest "+arr[0]);
        System.out.println("highest "+arr[arr.length-1]);

    }


}
