package day45_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

    // Code a program that counts the letters ang gives an output like this, (case sensetive)

    //J=1, a=8, c=3;

    public static void main(String[] args) {

        String str = "I love Java because It is the best";
        // I=2, l=1      .... a=3

        Map<String, Integer> numberOfLetters = new HashMap<>();   // We will change the constructor***********************

        // we splited the str to reach letters
        String [] letters= str.split(""); // [I,  , l, o, v, e,  , J, a, v, a,  , b, e, c, a, u, s, e,  , I, t,  , i, s,  , t, h, e,  , b, e, s, t]

        // to count letters, we created a counter and if we took a letter from the str, this means there is already one of that letter inside of str
        int counter = 1;

        // to take letters one by one, we created a loop starting from 0
        for (int i = 0; i < letters.length; i++) {

            // we have checked if we had already counted that the letter. If we had, let's continue
            if (numberOfLetters.containsKey(letters[i])){
                continue;
            }else {
                // If it is the first time, we matched the letter with the rest to see how many same letters there are in the str
                for (int j = i + 1; j < letters.length; j++) {
                    if (letters[i].equals(letters[j])) {
                        counter++;
                    }
                }
                // we added letter and the counter to the map
                numberOfLetters.put(letters[i], counter);

                // for each letter we should start counting from 1
                counter = 1;
            }
        }
        System.out.println(numberOfLetters);
    }
}
