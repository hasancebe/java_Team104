package day26_StaticBlock_passByValue;

import java.util.Arrays;

public class C06_PassByValueArrays2 {

    public static void main(String[] args) {

        // create a method
        // Inside of the method, Create an array longer than orginal one
        // for the longer array, all elements should be 5
        // assign this longer array to the orginal array and return it;

        int[] arr = {3,4,5};
        method(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] method (int[] arr){

        int[] newArr = new int[arr.length+2];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=5;
        }

        arr=newArr;

        return arr;
    }
}
