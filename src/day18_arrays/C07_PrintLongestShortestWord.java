package day18_arrays;

public class C07_PrintLongestShortestWord {


    public static void main(String[] args) {


        //Question 6- Create a method that prints the longest and shortest words in a given String array.

        String [] arr = {"Ali","veli","Hasan","mehmet"};
        shortestLongestWord(arr);
    }

    public static void shortestLongestWord(String [] arr){

        String longest  = arr[0];
        String shortest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(shortest.length()>arr[i].length()){
                shortest=arr[i];
            }
            if(longest.length()< arr[i].length()){
                longest=arr[i];
            }
        }
        System.out.println("shortest = " + shortest);
        System.out.println("longest = " + longest);


    }





}
