package day39_abstraction;

public class EHondaCivic extends BHonda {


    @Override
    public void motor() {
        System.out.println("HondaCivic motor v2");
    }
    @Override
    public void body() {
        System.out.println("HondaCivic has a space body");
    }
    @Override
    public void tire() {
        System.out.println("HondaCivic has tire");
    }
    @Override
    public void fuel() {
        System.out.println("HondaCivic uses fuel");
    }
    @Override
    public void security() {
        System.out.println("Honda Civic has high security");
    }
    public void cooler(){
        System.out.println("HondaCivic CoolerV3");
    }
    public void leatherSeats(){
        System.out.println("honda Civic leatherSeats V5");
    }
    public static void main(String[] args) {
        EHondaCivic car1= new EHondaCivic();

        car1.motor(); //honda civic class
        car1.body(); //honda civic class
        car1.cooler(); //honda civic class
        car1.tape();  //Honda class
        car1.leatherSeats(); //honda civic class
        car1.navigator(); //Acar
        car1.brand(); // BHonda
        car1.fuel(); // HondaCivic
        car1.security(); //HondaCivic
        car1.tire(); // HondaCivic

        /*
        all abstract methods mentioned in abstarct parents should be overridden. If any other child classes
        have not overridden it, the last normal class must override all of abstract methods

        note: this child class may choose not to override normal (concrete) methos.
        even if it does not override the normal(concrete) method, objects created from this class
        will have these methods, but it will use the original methods without any changes.
         */
    }
}
