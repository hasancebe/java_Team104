package day12_forLoops;

public class C02_ForLoops {


    public static void main(String[] args) {

        for (int i = 1; i <= 10; i+=2) {

            System.out.print(i+" ");
            
        }


        // print 2 digit numbers which are  divisible by 7
        System.out.println("----------------------");

        for (int i = 10; i <=99 ; i++) {

            if(i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("------------------------");
        // start from 13 and increase number by 7 until 200  and print them
                                //i= i+7
        for (int i = 13; i <200 ; i+=7) {

            if(i%2==0){
                System.out.print(i+" ");
            }

        }

        // print squares of numbers, from 1 until 10 (include the borders)
        System.out.println("----------------------");
        for (int i = 1; i <=10 ; i++) {

            System.out.print(i*i+" ");

        }


        
    }
    
}
