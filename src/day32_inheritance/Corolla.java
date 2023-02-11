package day32_inheritance;

public class Corolla extends BToyota {

    Corolla (int d){
        super(5);
        System.out.println("Corolla Const with parameter");
    }

    Corolla(String str){
        this();
        System.out.println("Corolla const with String par");
    }

    Corolla(){

        System.out.println("corolla Const without parameter");
    }

    public static void main(String[] args) {

        Corolla car1 = new Corolla("Mehmet");
    }
}
