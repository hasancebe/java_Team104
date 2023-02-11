package day26_StaticBlock_passByValue;

public class C01_StaticBlock {


    static {
        System.out.println("above static block ran");


    }


    public static void main(String[] args) {

        System.out.println("main method ran");

    }



    static {
        System.out.println("below static code ran");


    }



}
