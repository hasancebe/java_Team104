package day39_abstraction;

public abstract class ACar {

    /* Honda is planning to produce a new car. So honda asked world car standards company
    so that company gave us a few standards for us to follow.
    motor, body, tire, brand
    Optinal : LeatherSeats , Navigator
    WCSC
     */

    public abstract void motor();

    public abstract void brand();

    public abstract void body();

    public abstract void tire();

    public void leatherSeats(){
        System.out.println("ACar leatherSeats");
    }
    public void navigator(){
        System.out.println("ACar Navigator");
    }

}
