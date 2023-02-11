package day23_Constructors;

public class DCar {





    /*
     In a normal application, we do not need to create a main method for every classes,
     Actually most of time there will be only one main method.

     A class is like a storage to store methods and variables in the applications.
     And let's create a class as a storage for Cars

     For every classes created in Java, java will create a default constructor which is inwisible

     a default constractor will not have any parameters or code inside of it

     */


    int advertNo;
    String brand = " not assigned";
    String model = " not assigned";
    String fuel ;
    int price ;


    public String toString() {
        return
                "advertNo   : " + advertNo +
                "\nbrand    : " + brand +
                "\nmodel    : " + model +
                "\nfuel     : " + fuel +
                "\nprice    : " + price
                ;
    }

    public static void maxSpeed (String fuel) {
        if (fuel.equalsIgnoreCase("benzine")) {
            System.out.println("maxSpeed is 260 km/h for benzine");
        } else if (fuel.equalsIgnoreCase("diesel")) {
            System.out.println("maxSpeed is 240 km/h for diesel");
        } else if (fuel.equalsIgnoreCase("electric")) {
            System.out.println("maxSpeed is 200 km/h for electric");


        }


    }
}
