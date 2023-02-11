package day23_Constructors;

public class HCarRunner {

    public static void main(String[] args) {

        HCar firstCar = new HCar();

        firstCar.advertNo=1111;
        firstCar.brand = "Toyota";
        firstCar.model ="Corolla";
        firstCar.fuel = "diesel";
        firstCar.price= 13000;

        System.out.println(firstCar);


        HCar secondCar = new HCar(2002,"Tesla","x","electric",100000);
        System.out.println("---------------");
        System.out.println(secondCar);
        HCar.maxSpeed(secondCar.fuel);

        HCar thirdCar = new HCar(3000,"Mercedes","E200");

        System.out.println("-----------------");
        System.out.println(thirdCar);


    }



}
