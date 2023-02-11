package day26_StaticBlock_passByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        double price = 100;

        System.out.println(doDiscount(price)); //90
        System.out.println(doDiscount(price)); //90
        System.out.println(doDiscount(price)); //90


        System.out.println("the price inside of the main method : "+price);

        price = doDiscount(price);
        System.out.println("after assingment, the price is : "+ price);

    }

    public static double doDiscount(double ahmet){

        //make %10 discount

        ahmet= ahmet * 0.9;

        return ahmet;

    }


    // to make our codes more understandable, we write parameters for codes and most of time we use similar names.
    // but actually it does not matter
    // because java does not send the variable, instead of that java passes (sends) value of the variable.

    // developers of Java made it this way.

    // if we want to make it permanent we can assign the value to orginal one


}
