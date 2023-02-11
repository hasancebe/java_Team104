package day12_forLoops;

public class C04_Factorial {


    public static void main(String[] args) {

        //get a number from user and
        // calculate it like :
        //5! =  5*4*3*2*1 = 120


        int number = 5 ;
        int result = 1;

        for (int i = number; i >=1 ; i--) {

            result = result*i;


        }


        // print summation of all numbers from 1 to 100 (include borders)

        int totalNumber=0;

        for (int i = 1; i <=100 ; i++) {

            totalNumber = totalNumber+i;

            //System.out.print(totalNumber+ " ");

        }
        System.out.println(totalNumber);











    }
}
