package day23_Constructors;

public class HCar {

    int advertNo;
    String brand = " not assigned";
    String model = " not assigned";
    String fuel ;
    int price ;
    static int numberOfTires = 4;

    public HCar (){

    }

    public HCar(int advNo, String brnd, String mdl){
        advertNo=advNo;
        brand=brnd;
        model=mdl;
    }


    public HCar (int adNo,String brd , String mdl, String fl, int prc){
        advertNo=adNo;
        brand=brd;
        model=mdl;
        fuel=fl;
        price=prc;
    }

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
