package day33_Inheritance;

public class Corolla extends BToyota{

    String model ="Corolla";
    String madeIn ="Turkey";
    int year = 2023;

    public static void main(String[] args) {
        /*
        ===FOR VARIABLES===
        When ever we try to create objects from classes we can use different
        constructors and dataTypes if there is a parent child relation.

        To find value of variables, we should go to the data type's class and java will
        take value from this class. If Java can not find it there, it will check parent
        class BUT it won't check smaller children classes
         */

        ACar car6 = new ACar();
        //System.out.println(car6.model); // CTE
        //System.out.println(car6.madeIn); // CTE
        //System.out.println(car6.year);  // CTE
        //System.out.println(car6.color); // CTE
        System.out.println(car6.fuel); // ACar
        System.out.println(car6.motor); // ACar
        System.out.println(car6.plate); // ACar


        ACar car5 = new BToyota();
        //System.out.println(car5.model); // CTE
        //System.out.println(car5.madeIn); // CTE
        //System.out.println(car5.year);  // CTE
        //System.out.println(car5.color); // CTE
        System.out.println(car5.fuel); // ACar
        System.out.println(car5.motor); // ACar
        System.out.println(car5.plate); // ACar



        BToyota car4 = new BToyota();
        //System.out.println(car4.model); // CTE
        System.out.println(car4.madeIn); // BToyota
        //System.out.println(car4.year);  // CTE
        System.out.println(car4.color); // BToyota
        System.out.println(car4.fuel); // BToyota
        System.out.println(car4.motor); // ACar
        System.out.println(car4.plate); // ACar



        ACar car3= new Corolla();
        //System.out.println(car3.model); // CTE
        //System.out.println(car3.madeIn); // CTE
        //System.out.println(car3.year);  // CTE
        //System.out.println(car3.color); // CTE
        System.out.println(car3.fuel); // ACar
        System.out.println(car3.motor); // ACar
        System.out.println(car3.plate); // ACar


        Corolla car1 = new Corolla();
        System.out.println(car1.model); // Corolla
        System.out.println(car1.madeIn); // Corolla
        System.out.println(car1.year);  // Corolla
        System.out.println(car1.color); // BToyota
        System.out.println(car1.fuel); // BToyota
        System.out.println(car1.motor); // ACar
        System.out.println(car1.plate); // ACar

        System.out.println("==============");
        BToyota car2 = new Corolla();
        //System.out.println(car2.model); // CTE
        System.out.println(car2.madeIn); // BToyota
        //System.out.println(car2.year);  // CTE
        System.out.println(car2.color); // BToyota
        System.out.println(car2.fuel); // BToyota
        System.out.println(car2.motor); // ACar
        System.out.println(car2.plate); // ACar


    }

}
