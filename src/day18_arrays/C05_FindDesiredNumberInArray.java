package day18_arrays;

public class C05_FindDesiredNumberInArray {

    public static void main(String[] args) {

        //Question 4- Create a method that prints whether a
        // desired element exists in a given array and, if so, how many times it has been used.


        int [] arr= {2,3,4,6,3,4,2,5,2,4,5,6,3,2};

        int desiredNumber = 3;

        isThereDesiredNumber(arr,desiredNumber);
    }
    public static void isThereDesiredNumber(int[] arr, int desiredNumber){

        int counter=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==desiredNumber){
                counter++;
            }
        }

        if (counter==0){
            System.out.println("Array does not have the "+desiredNumber+" inside of it");

        }else {
            System.out.println("Array has "+desiredNumber+", "+counter+" times ");
        }




    }
}
