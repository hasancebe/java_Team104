package day04_incremets_decrements;

public class C03_Incr_Decr {


    public static void main(String[] args) {


    int a = 10 ;

    int b = a++;

    int c = ++b;

        System.out.println("a: "+a+" ,b: "+b+" ,c: "+c);

    a = 20;

    b = ++a;

    c= a++;

        System.out.println("a: "+a+" ,b: "+b+" ,c: "+c);



        a = 30;

        System.out.println(a++);  // 30
        System.out.println(--a);    //30
        System.out.println(a--);    //30
        System.out.println(a);      //29





    }

}
