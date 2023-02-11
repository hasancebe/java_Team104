package day31_Inheritance;

import day12_forLoops.C01_ForLoops;

public class CSuv extends BCars {

    boolean allWheelDrive = true;

    public static void main(String[] args) {
        CSuv car1 = new CSuv();


        System.out.println(car1.motor);
        System.out.println(car1.plate);
        System.out.println(car1.fuel);
        car1.tire();
        System.out.println(car1.brand);
        System.out.println(car1.year);
        System.out.println(car1.model);

        System.out.println(car1.allWheelDrive);
        System.out.println("----------------------------------");


        CSuv car2 = new CSuv();

        car2.brand="Toyota";
        car2.model="Rav4";
        car2.motor="2.4 HDI";
        car2.plate =" 06 HR 704";
        car2.fuel = "benzine";
        car2.speed(car2.fuel);


    }

    public void speed(String fuel){
        if (fuel.equalsIgnoreCase("benzine")){
            System.out.println("max speed is 360");
        }else if (fuel.equalsIgnoreCase("diesel")){
            System.out.println("max speed is 300");
        } else if (fuel.equalsIgnoreCase("hybrid")) {
            System.out.println("max speed is 320");
        }else {
            System.out.println("unknown fuel");
        }


    }


}
