package day47_Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C04_Questions {


    // Code a program that counts the letters ang gives an output like this, (case sensetive)

    //J=1, a=8, c=3;

    public static void main(String[] args) {
        String str = "Java was funny but no more java after Saturday";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        Map<String,Integer> lettersAndNumbers = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            // computeIfPresent, computeIfAbsent

            // If the map has the key, increase the value by one
            lettersAndNumbers.computeIfPresent(arr[i],(k,v) -> v+1 );

            // if the map does not have the key, create the entry and set the value to 1;
            //lettersAndNumbers.computeIfAbsent(arr[i],v-> 1);
            lettersAndNumbers.putIfAbsent(arr[i],1);

        }

        System.out.println(lettersAndNumbers); // { =8, J=1, S=1, a=8, b=1, d=1, e=2, f=2, j=1, m=1, n=3, o=2, r=3, s=1, t=3, u=3, v=2, w=1, y=2}



    }
}
