package day24_ConstractorsWithParameters;

public class Rope {

    public Rope (){

    }

    public  void test(){

        System.out.println("test");
    }

    public static void main(String[] args) {

        Rope rope1 = null;
        rope1.test(); // NullPointerException

    }


}
