package day31_Inheritance;

public class FToyota extends ECars{

    FToyota(){
        super();
        System.out.println("FToyota cons ran");
    }

    protected String brand = " Toyota";
    protected  String motor = "Good Motor";
    protected String color = "color is not assigned ";
    protected String madeIn =" not assigned";
    protected int speed = 130;

    // protected is for inheritance and anychild can reach them
    // if we do not mention any access modifiers they will be default
    // if it is default they are not reachable from outside of the package



}
