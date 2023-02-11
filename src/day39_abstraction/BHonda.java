package day39_abstraction;

public abstract class BHonda extends ACar{

    /*
    When we parent an abstract class we have two options
    1- we can create a normal class to override all abstract methods
    2- If we need to create a mid level abstarct class, we can create another abstract class
    to add more standards
     */


    @Override
    public void brand(){
        System.out.println("Honda Class, brand is Honda");
    }



    public abstract void fuel();

    public abstract void security();

    public void cooler(){ // optional to use
        System.out.println("Honda standart Cooler");
    }

    public void tape(){ // optional to use
        System.out.println("Honda standard Tape");
    }



}
