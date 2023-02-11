package day24_ConstractorsWithParameters;

public class CarRunner {

    public static void main(String[] args) {


        Car firstCar = new Car();

        firstCar.advertNo= 1234;
        firstCar.brand ="Opel";
        firstCar.model ="Corsa";
        firstCar.fuel =" benzine";
        firstCar.year =1999;


        Car secondCar = new Car(4321,"Mercedes","E200","diesel",2013);

        System.out.println(secondCar);

    }


}
