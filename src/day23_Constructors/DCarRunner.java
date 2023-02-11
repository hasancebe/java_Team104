package day23_Constructors;

public class DCarRunner {

    public static void main(String[] args) {

        //Let's create an object from DCar Class

        DCar firstCar = new DCar();

        System.out.println(firstCar.advertNo);
        System.out.println(firstCar.brand);
        System.out.println(firstCar.model);
        System.out.println(firstCar.fuel);
        System.out.println(firstCar.price);



        firstCar.advertNo =1001;
        firstCar.brand = "BMW";
        firstCar.model = "E5.20";
        firstCar.fuel="benzine";
        firstCar.price=10000;

        System.out.println("-------------------");
        System.out.println(firstCar.advertNo);
        System.out.println(firstCar.brand);
        System.out.println(firstCar.model);
        System.out.println(firstCar.fuel);
        System.out.println(firstCar.price);
        DCar.maxSpeed(firstCar.fuel);


        System.out.println(firstCar);

        DCar secondCar = new DCar();

        System.out.println(secondCar);




    }
}
