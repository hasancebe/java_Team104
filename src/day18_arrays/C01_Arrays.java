package day18_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int [] arr = {2,4,6,8,10,14,15,17};

        // print 6 on to console

        System.out.println(arr[4]); // 10

        // change 6 with 13
        arr[2]=13;

        System.out.println(arr[2]);  //13


        System.out.println("---------------------------");
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");

        }



    }

}
